/*
* generated by Xtext
*/
package autoevaluacion;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AutoevaluacionUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return autoevaluacion.ui.internal.AutoevaluacionActivator.getInstance().getInjector("autoevaluacion.Autoevaluacion");
	}
	
}