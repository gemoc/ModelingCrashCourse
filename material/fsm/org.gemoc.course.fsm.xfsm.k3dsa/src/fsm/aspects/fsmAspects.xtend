package fsm.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fsm.FiniteStateMachine
import fsm.State
import fsm.Transition

import static extension fsm.aspects.FiniteStateMachineAspect.*
import static extension fsm.aspects.StateAspect.*
import static extension fsm.aspects.TransitionAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.emf.common.util.EList
import fr.inria.diverse.k3.al.annotationprocessor.Main

@Aspect(className=FiniteStateMachine)
class FiniteStateMachineAspect {
	public State currentState
		
	public String unprocessedString
	public String consummedString
	public String producedString 
	
	
	@Main
    def public void main() {
    	try{
    		while (!_self.unprocessedString.isEmpty) {
    			_self.currentState.step(_self.unprocessedString)
    		}    		
		} catch (Exception nt){
			println("Stopped due to "+nt.message)
		}
		println("unprocessed string: "+_self.unprocessedString)
		println("processed string: "+_self.consummedString)
		println("produced string: "+_self.producedString)
	}
       
      
    @Step 
	@InitializeModel
	def public void initializeModel(EList<String> args){
		_self.currentState = _self.states.findFirst[s | s.isInitialState]
		_self.unprocessedString = args.get(0)
		_self.consummedString = ""
		_self.producedString = ""
	}
}

@Aspect(className=State)
class StateAspect {
	@Step
	def public void step(String inputString) {
		// Get the valid transitions	
		val validTransitions =  _self.outgoingTransitions.filter[t | inputString.startsWith(t.input)]
		if(validTransitions.empty) {
			throw new Exception("No Transition")
		}
		if(validTransitions.size > 1) {
			throw new Exception("Non Determinism")
		}
		// Fire transition
		validTransitions.get(0).fire
	}
}

@Aspect(className=Transition)
class TransitionAspect {
	@Step
	def public void fire() {
		println("Firing " + _self.name + " and entering " + _self.target.name)
		val fsm = _self.eContainer.eContainer as FiniteStateMachine
		fsm.currentState = _self.target
		println('''consumming «_self.input» and producing «_self.output»''')
		fsm.producedString = fsm.producedString + _self.output
		fsm.consummedString = fsm.consummedString + _self.input
		fsm.unprocessedString = fsm.unprocessedString.substring(_self.input.length)
				
	}
}



