/*
* generated by Xtext
*/
package autoevaluacion;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AutoevaluacionStandaloneSetup extends AutoevaluacionStandaloneSetupGenerated{

	public static void doSetup() {
		new AutoevaluacionStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

