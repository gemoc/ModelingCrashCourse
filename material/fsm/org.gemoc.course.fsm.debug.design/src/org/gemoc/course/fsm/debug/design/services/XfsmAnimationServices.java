package org.gemoc.course.fsm.debug.design.services;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine;
import org.gemoc.course.fsm.xfsm.fsm.State;

public class XfsmAnimationServices {

	public boolean isCurrentState(EObject o){
		if(o instanceof State){
			return ((FiniteStateMachine)((State)o).eContainer()).getCurrentState() == o;
		} else {
			return false;
		}
	}
}
