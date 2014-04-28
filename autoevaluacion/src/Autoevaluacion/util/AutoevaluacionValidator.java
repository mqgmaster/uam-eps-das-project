/**
 */
package Autoevaluacion.util;

import Autoevaluacion.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Autoevaluacion.AutoevaluacionPackage
 * @generated
 */
public class AutoevaluacionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AutoevaluacionValidator INSTANCE = new AutoevaluacionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Autoevaluacion";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoevaluacionValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AutoevaluacionPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AutoevaluacionPackage.HOJA:
				return validateHoja((Hoja)value, diagnostics, context);
			case AutoevaluacionPackage.EJERCICIO:
				return validateEjercicio((Ejercicio)value, diagnostics, context);
			case AutoevaluacionPackage.RESPUESTA:
				return validateRespuesta((Respuesta)value, diagnostics, context);
			case AutoevaluacionPackage.RESPUESTA_UNICA:
				return validateRespuestaUnica((RespuestaUnica)value, diagnostics, context);
			case AutoevaluacionPackage.RESPUESTA_MULTIPLE:
				return validateRespuestaMultiple((RespuestaMultiple)value, diagnostics, context);
			case AutoevaluacionPackage.TEXTO_LIBRE:
				return validateTextoLibre((TextoLibre)value, diagnostics, context);
			case AutoevaluacionPackage.ORDENACION:
				return validateOrdenacion((Ordenacion)value, diagnostics, context);
			case AutoevaluacionPackage.CLASICO:
				return validateClasico((Clasico)value, diagnostics, context);
			case AutoevaluacionPackage.WIZARD:
				return validateWizard((Wizard)value, diagnostics, context);
			case AutoevaluacionPackage.WIZARD_ADAPTATIVO:
				return validateWizardAdaptativo((WizardAdaptativo)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoja(Hoja hoja, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hoja, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hoja, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hoja, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hoja, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hoja, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hoja, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hoja, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hoja, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hoja, diagnostics, context);
		if (result || diagnostics != null) result &= validateHoja_uniqueName(hoja, diagnostics, context);
		if (result || diagnostics != null) result &= validateHoja_uniqueOrder(hoja, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueName constraint of '<em>Hoja</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HOJA__UNIQUE_NAME__EEXPRESSION = "\n" +
		"\t\t\tejercicios->isUnique(name)";

	/**
	 * Validates the uniqueName constraint of '<em>Hoja</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoja_uniqueName(Hoja hoja, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AutoevaluacionPackage.Literals.HOJA,
				 hoja,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueName",
				 HOJA__UNIQUE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueOrder constraint of '<em>Hoja</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HOJA__UNIQUE_ORDER__EEXPRESSION = "\n" +
		"\t\t\tejercicios->isUnique(order)";

	/**
	 * Validates the uniqueOrder constraint of '<em>Hoja</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoja_uniqueOrder(Hoja hoja, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AutoevaluacionPackage.Literals.HOJA,
				 hoja,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueOrder",
				 HOJA__UNIQUE_ORDER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjercicio(Ejercicio ejercicio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ejercicio, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ejercicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ejercicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ejercicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ejercicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ejercicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ejercicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ejercicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ejercicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateEjercicio_nonEmptyName(ejercicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateEjercicio_nonEmptyEnunciado(ejercicio, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nonEmptyName constraint of '<em>Ejercicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EJERCICIO__NON_EMPTY_NAME__EEXPRESSION = "\n" +
		"\t\t    not name.oclIsUndefined() \n" +
		"\t\t    and name <> ''";

	/**
	 * Validates the nonEmptyName constraint of '<em>Ejercicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjercicio_nonEmptyName(Ejercicio ejercicio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AutoevaluacionPackage.Literals.EJERCICIO,
				 ejercicio,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nonEmptyName",
				 EJERCICIO__NON_EMPTY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the nonEmptyEnunciado constraint of '<em>Ejercicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EJERCICIO__NON_EMPTY_ENUNCIADO__EEXPRESSION = "\n" +
		"\t\t    not enunciado.oclIsUndefined()\n" +
		"\t\t    and enunciado <> ''";

	/**
	 * Validates the nonEmptyEnunciado constraint of '<em>Ejercicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEjercicio_nonEmptyEnunciado(Ejercicio ejercicio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AutoevaluacionPackage.Literals.EJERCICIO,
				 ejercicio,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nonEmptyEnunciado",
				 EJERCICIO__NON_EMPTY_ENUNCIADO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRespuesta(Respuesta respuesta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(respuesta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRespuestaUnica(RespuestaUnica respuestaUnica, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(respuestaUnica, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(respuestaUnica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(respuestaUnica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(respuestaUnica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(respuestaUnica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(respuestaUnica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(respuestaUnica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(respuestaUnica, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(respuestaUnica, diagnostics, context);
		if (result || diagnostics != null) result &= validateRespuestaUnica_uniqueAnswer(respuestaUnica, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueAnswer constraint of '<em>Respuesta Unica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESPUESTA_UNICA__UNIQUE_ANSWER__EEXPRESSION = "\n" +
		"\t\t\tcorrectas->size()=1";

	/**
	 * Validates the uniqueAnswer constraint of '<em>Respuesta Unica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRespuestaUnica_uniqueAnswer(RespuestaUnica respuestaUnica, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AutoevaluacionPackage.Literals.RESPUESTA_UNICA,
				 respuestaUnica,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueAnswer",
				 RESPUESTA_UNICA__UNIQUE_ANSWER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRespuestaMultiple(RespuestaMultiple respuestaMultiple, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(respuestaMultiple, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextoLibre(TextoLibre textoLibre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textoLibre, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textoLibre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textoLibre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textoLibre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textoLibre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textoLibre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textoLibre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textoLibre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textoLibre, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextoLibre_posibleAnswers(textoLibre, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the posibleAnswers constraint of '<em>Texto Libre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEXTO_LIBRE__POSIBLE_ANSWERS__EEXPRESSION = "\n" +
		"\t\t\tcorrectas->size()>0";

	/**
	 * Validates the posibleAnswers constraint of '<em>Texto Libre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextoLibre_posibleAnswers(TextoLibre textoLibre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AutoevaluacionPackage.Literals.TEXTO_LIBRE,
				 textoLibre,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "posibleAnswers",
				 TEXTO_LIBRE__POSIBLE_ANSWERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdenacion(Ordenacion ordenacion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordenacion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordenacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordenacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordenacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordenacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordenacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordenacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordenacion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordenacion, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrdenacion_uniqueAnswer(ordenacion, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueAnswer constraint of '<em>Ordenacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ORDENACION__UNIQUE_ANSWER__EEXPRESSION = "\n" +
		"\t\t\tcorrectas->size()=1";

	/**
	 * Validates the uniqueAnswer constraint of '<em>Ordenacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdenacion_uniqueAnswer(Ordenacion ordenacion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AutoevaluacionPackage.Literals.ORDENACION,
				 ordenacion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueAnswer",
				 ORDENACION__UNIQUE_ANSWER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClasico(Clasico clasico, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clasico, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clasico, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clasico, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clasico, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clasico, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clasico, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clasico, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clasico, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clasico, diagnostics, context);
		if (result || diagnostics != null) result &= validateHoja_uniqueName(clasico, diagnostics, context);
		if (result || diagnostics != null) result &= validateHoja_uniqueOrder(clasico, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizard(Wizard wizard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wizard, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validateHoja_uniqueName(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validateHoja_uniqueOrder(wizard, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizardAdaptativo(WizardAdaptativo wizardAdaptativo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wizardAdaptativo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wizardAdaptativo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wizardAdaptativo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wizardAdaptativo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wizardAdaptativo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wizardAdaptativo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wizardAdaptativo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wizardAdaptativo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wizardAdaptativo, diagnostics, context);
		if (result || diagnostics != null) result &= validateHoja_uniqueName(wizardAdaptativo, diagnostics, context);
		if (result || diagnostics != null) result &= validateHoja_uniqueOrder(wizardAdaptativo, diagnostics, context);
		if (result || diagnostics != null) result &= validateWizardAdaptativo_respOnce(wizardAdaptativo, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the respOnce constraint of '<em>Wizard Adaptativo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WIZARD_ADAPTATIVO__RESP_ONCE__EEXPRESSION = "\n" +
		"\t\t\tejerciciosRespondidos->isUnique(name)";

	/**
	 * Validates the respOnce constraint of '<em>Wizard Adaptativo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizardAdaptativo_respOnce(WizardAdaptativo wizardAdaptativo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AutoevaluacionPackage.Literals.WIZARD_ADAPTATIVO,
				 wizardAdaptativo,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "respOnce",
				 WIZARD_ADAPTATIVO__RESP_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AutoevaluacionValidator
