package org.gemoc.course.fsm.debug.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;


public class XfsmAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("FSMCrashCourse", "Debug"));
		res.add(new StringCouple("XFSM", "Animation"));

		return res;
	}

}
