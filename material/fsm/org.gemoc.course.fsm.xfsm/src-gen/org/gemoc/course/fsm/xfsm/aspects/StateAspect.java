package org.gemoc.course.fsm.xfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.course.fsm.xfsm.fsm.State;
import org.gemoc.course.fsm.xfsm.fsm.Transition;
import org.gemoc.course.fsm.xfsm.aspects.StateAspectStateAspectProperties;
import org.gemoc.course.fsm.xfsm.aspects.TransitionAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  @Step
  public static void step(final State _self, final String inputString) {
	final org.gemoc.course.fsm.xfsm.aspects.StateAspectStateAspectProperties _self_ = org.gemoc.course.fsm.xfsm.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_step(_self_, _self, inputString);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "State", "step");
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
  
  protected static void _privk3_step(final StateAspectStateAspectProperties _self_, final State _self, final String inputString) {
    try {
      EList<Transition> _outgoingTransitions = _self.getOutgoingTransitions();
      final Function1<Transition, Boolean> _function = (Transition t) -> {
        String _input = t.getInput();
        return Boolean.valueOf(inputString.startsWith(_input));
      };
      final Iterable<Transition> validTransitions = IterableExtensions.<Transition>filter(_outgoingTransitions, _function);
      boolean _isEmpty = IterableExtensions.isEmpty(validTransitions);
      if (_isEmpty) {
        throw new Exception("No Transition");
      }
      int _size = IterableExtensions.size(validTransitions);
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        throw new Exception("Non Determinism");
      }
      Transition _get = ((Transition[])Conversions.unwrapArray(validTransitions, Transition.class))[0];
      TransitionAspect.fire(_get);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
