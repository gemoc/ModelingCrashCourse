/**
 * generated by Xtext 2.10.0
 */
package org.gemoc.course.fsm.xtext;

import org.gemoc.course.fsm.xtext.FSMStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class FSMStandaloneSetup extends FSMStandaloneSetupGenerated {
  public static void doSetup() {
    FSMStandaloneSetup _fSMStandaloneSetup = new FSMStandaloneSetup();
    _fSMStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
