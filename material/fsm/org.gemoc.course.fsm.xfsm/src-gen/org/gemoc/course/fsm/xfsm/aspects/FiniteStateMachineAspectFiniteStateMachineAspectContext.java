package org.gemoc.course.fsm.xfsm.aspects;

import org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine;
import org.gemoc.course.fsm.xfsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class FiniteStateMachineAspectFiniteStateMachineAspectContext {
  public final static FiniteStateMachineAspectFiniteStateMachineAspectContext INSTANCE = new FiniteStateMachineAspectFiniteStateMachineAspectContext();
  
  public static FiniteStateMachineAspectFiniteStateMachineAspectProperties getSelf(final FiniteStateMachine _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.course.fsm.xfsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FiniteStateMachine, FiniteStateMachineAspectFiniteStateMachineAspectProperties> map = new java.util.WeakHashMap<org.gemoc.course.fsm.xfsm.fsm.FiniteStateMachine, org.gemoc.course.fsm.xfsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties>();
  
  public Map<FiniteStateMachine, FiniteStateMachineAspectFiniteStateMachineAspectProperties> getMap() {
    return map;
  }
}
