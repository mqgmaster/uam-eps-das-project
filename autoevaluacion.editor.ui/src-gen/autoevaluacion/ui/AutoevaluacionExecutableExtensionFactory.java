/*
 * generated by Xtext
 */
package autoevaluacion.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import autoevaluacion.ui.internal.AutoevaluacionActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AutoevaluacionExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AutoevaluacionActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AutoevaluacionActivator.getInstance().getInjector(AutoevaluacionActivator.AUTOEVALUACION_AUTOEVALUACION);
	}
	
}