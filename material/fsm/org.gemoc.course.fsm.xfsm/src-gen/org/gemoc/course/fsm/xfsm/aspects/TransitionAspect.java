package org.gemoc.course.fsm.xfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine;
import org.gemoc.course.fsm.xfsm.fsm.State;
import org.gemoc.course.fsm.xfsm.fsm.Transition;
import org.gemoc.course.fsm.xfsm.aspects.FiniteStateMachineAspect;
import org.gemoc.course.fsm.xfsm.aspects.TransitionAspectTransitionAspectProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static void fire(final Transition _self) {
	final org.gemoc.course.fsm.xfsm.aspects.TransitionAspectTransitionAspectProperties _self_ = org.gemoc.course.fsm.xfsm.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_fire(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Transition", "fire");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    String _name = _self.getName();
    String _plus = ("Firing " + _name);
    String _plus_1 = (_plus + " and entering ");
    State _target = _self.getTarget();
    String _name_1 = _target.getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
    EObject _eContainer = _self.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    final FiniteStateMachine fsm = ((FiniteStateMachine) _eContainer_1);
    State _target_1 = _self.getTarget();
    FiniteStateMachineAspect.currentState(fsm, _target_1);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("consumming ");
    String _input = _self.getInput();
    _builder.append(_input, "");
    _builder.append(" and producing ");
    String _output = _self.getOutput();
    _builder.append(_output, "");
    InputOutput.<String>println(_builder.toString());
    String _producedString = FiniteStateMachineAspect.producedString(fsm);
    String _output_1 = _self.getOutput();
    String _plus_3 = (_producedString + _output_1);
    FiniteStateMachineAspect.producedString(fsm, _plus_3);
    String _consummedString = FiniteStateMachineAspect.consummedString(fsm);
    String _input_1 = _self.getInput();
    String _plus_4 = (_consummedString + _input_1);
    FiniteStateMachineAspect.consummedString(fsm, _plus_4);
    String _unprocessedString = FiniteStateMachineAspect.unprocessedString(fsm);
    String _input_2 = _self.getInput();
    int _length = _input_2.length();
    String _substring = _unprocessedString.substring(_length);
    FiniteStateMachineAspect.unprocessedString(fsm, _substring);
  }
}
