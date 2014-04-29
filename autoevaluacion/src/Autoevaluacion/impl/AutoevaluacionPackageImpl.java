/**
 */
package Autoevaluacion.impl;

import Autoevaluacion.AutoevaluacionFactory;
import Autoevaluacion.AutoevaluacionPackage;
import Autoevaluacion.Clasico;
import Autoevaluacion.Ejercicio;
import Autoevaluacion.Hoja;
import Autoevaluacion.Ordenacion;
import Autoevaluacion.Respuesta;
import Autoevaluacion.RespuestaMultiple;
import Autoevaluacion.RespuestaUnica;
import Autoevaluacion.TextoLibre;
import Autoevaluacion.Wizard;
import Autoevaluacion.WizardAdaptativo;
import Autoevaluacion.util.AutoevaluacionValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutoevaluacionPackageImpl extends EPackageImpl implements AutoevaluacionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hojaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejercicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respuestaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respuestaUnicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respuestaMultipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textoLibreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordenacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clasicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardAdaptativoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Autoevaluacion.AutoevaluacionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AutoevaluacionPackageImpl() {
		super(eNS_URI, AutoevaluacionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AutoevaluacionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AutoevaluacionPackage init() {
		if (isInited) return (AutoevaluacionPackage)EPackage.Registry.INSTANCE.getEPackage(AutoevaluacionPackage.eNS_URI);

		// Obtain or create and register package
		AutoevaluacionPackageImpl theAutoevaluacionPackage = (AutoevaluacionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AutoevaluacionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AutoevaluacionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAutoevaluacionPackage.createPackageContents();

		// Initialize created meta-data
		theAutoevaluacionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAutoevaluacionPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AutoevaluacionValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAutoevaluacionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AutoevaluacionPackage.eNS_URI, theAutoevaluacionPackage);
		return theAutoevaluacionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHoja() {
		return hojaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHoja_Ejercicios() {
		return (EReference)hojaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHoja_Puntuacion() {
		return (EAttribute)hojaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHoja_Penalizacion() {
		return (EAttribute)hojaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEjercicio() {
		return ejercicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjercicio_Enunciado() {
		return (EAttribute)ejercicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjercicio_PuntuacionEj() {
		return (EAttribute)ejercicioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEjercicio_Respuesta() {
		return (EReference)ejercicioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjercicio_Categoria() {
		return (EAttribute)ejercicioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjercicio_Name() {
		return (EAttribute)ejercicioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEjercicio_Order() {
		return (EAttribute)ejercicioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespuesta() {
		return respuestaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespuesta_Correctas() {
		return (EAttribute)respuestaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespuesta_Alternativas() {
		return (EAttribute)respuestaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespuestaUnica() {
		return respuestaUnicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespuestaMultiple() {
		return respuestaMultipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextoLibre() {
		return textoLibreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdenacion() {
		return ordenacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClasico() {
		return clasicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizard() {
		return wizardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizardAdaptativo() {
		return wizardAdaptativoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoevaluacionFactory getAutoevaluacionFactory() {
		return (AutoevaluacionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hojaEClass = createEClass(HOJA);
		createEReference(hojaEClass, HOJA__EJERCICIOS);
		createEAttribute(hojaEClass, HOJA__PUNTUACION);
		createEAttribute(hojaEClass, HOJA__PENALIZACION);

		ejercicioEClass = createEClass(EJERCICIO);
		createEAttribute(ejercicioEClass, EJERCICIO__ENUNCIADO);
		createEAttribute(ejercicioEClass, EJERCICIO__PUNTUACION_EJ);
		createEReference(ejercicioEClass, EJERCICIO__RESPUESTA);
		createEAttribute(ejercicioEClass, EJERCICIO__CATEGORIA);
		createEAttribute(ejercicioEClass, EJERCICIO__NAME);
		createEAttribute(ejercicioEClass, EJERCICIO__ORDER);

		respuestaEClass = createEClass(RESPUESTA);
		createEAttribute(respuestaEClass, RESPUESTA__CORRECTAS);
		createEAttribute(respuestaEClass, RESPUESTA__ALTERNATIVAS);

		respuestaUnicaEClass = createEClass(RESPUESTA_UNICA);

		respuestaMultipleEClass = createEClass(RESPUESTA_MULTIPLE);

		textoLibreEClass = createEClass(TEXTO_LIBRE);

		ordenacionEClass = createEClass(ORDENACION);

		clasicoEClass = createEClass(CLASICO);

		wizardEClass = createEClass(WIZARD);

		wizardAdaptativoEClass = createEClass(WIZARD_ADAPTATIVO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		respuestaUnicaEClass.getESuperTypes().add(this.getRespuesta());
		respuestaMultipleEClass.getESuperTypes().add(this.getRespuesta());
		textoLibreEClass.getESuperTypes().add(this.getRespuesta());
		ordenacionEClass.getESuperTypes().add(this.getRespuesta());
		clasicoEClass.getESuperTypes().add(this.getHoja());
		wizardEClass.getESuperTypes().add(this.getHoja());
		wizardAdaptativoEClass.getESuperTypes().add(this.getHoja());

		// Initialize classes, features, and operations; add parameters
		initEClass(hojaEClass, Hoja.class, "Hoja", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHoja_Ejercicios(), this.getEjercicio(), null, "ejercicios", null, 1, -1, Hoja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHoja_Puntuacion(), ecorePackage.getEDouble(), "puntuacion", null, 1, 1, Hoja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHoja_Penalizacion(), ecorePackage.getEDouble(), "penalizacion", null, 1, 1, Hoja.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejercicioEClass, Ejercicio.class, "Ejercicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEjercicio_Enunciado(), ecorePackage.getEString(), "enunciado", null, 1, 1, Ejercicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEjercicio_PuntuacionEj(), ecorePackage.getEDouble(), "puntuacionEj", null, 0, 1, Ejercicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEjercicio_Respuesta(), this.getRespuesta(), null, "respuesta", null, 1, 1, Ejercicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEjercicio_Categoria(), ecorePackage.getEString(), "categoria", null, 0, 1, Ejercicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEjercicio_Name(), ecorePackage.getEString(), "name", null, 1, 1, Ejercicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEjercicio_Order(), ecorePackage.getEInt(), "order", null, 1, 1, Ejercicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(respuestaEClass, Respuesta.class, "Respuesta", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRespuesta_Correctas(), ecorePackage.getEString(), "correctas", null, 0, -1, Respuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespuesta_Alternativas(), ecorePackage.getEString(), "alternativas", null, 0, -1, Respuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(respuestaUnicaEClass, RespuestaUnica.class, "RespuestaUnica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(respuestaMultipleEClass, RespuestaMultiple.class, "RespuestaMultiple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textoLibreEClass, TextoLibre.class, "TextoLibre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ordenacionEClass, Ordenacion.class, "Ordenacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clasicoEClass, Clasico.class, "Clasico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wizardEClass, Wizard.class, "Wizard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wizardAdaptativoEClass, WizardAdaptativo.class, "WizardAdaptativo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
		   });											
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (hojaEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueName uniqueOrder"
		   });			
		addAnnotation
		  (ejercicioEClass, 
		   source, 
		   new String[] {
			 "constraints", "nonEmptyName nonEmptyEnunciado"
		   });			
		addAnnotation
		  (respuestaUnicaEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueAnswer"
		   });			
		addAnnotation
		  (textoLibreEClass, 
		   source, 
		   new String[] {
			 "constraints", "posibleAnswers"
		   });			
		addAnnotation
		  (ordenacionEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueAnswer"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
		addAnnotation
		  (hojaEClass, 
		   source, 
		   new String[] {
			 "uniqueName", "\n\t\t\tejercicios->isUnique(name)",
			 "uniqueOrder", "\n\t\t\tejercicios->isUnique(order)"
		   });			
		addAnnotation
		  (ejercicioEClass, 
		   source, 
		   new String[] {
			 "nonEmptyName", "\n\t\t    not name.oclIsUndefined() \n\t\t    and name <> \'\'",
			 "nonEmptyEnunciado", "\n\t\t    not enunciado.oclIsUndefined()\n\t\t    and enunciado <> \'\'"
		   });			
		addAnnotation
		  (respuestaUnicaEClass, 
		   source, 
		   new String[] {
			 "uniqueAnswer", "\n\t\t\tcorrectas->size()=1"
		   });			
		addAnnotation
		  (textoLibreEClass, 
		   source, 
		   new String[] {
			 "posibleAnswers", "\n\t\t\tcorrectas->size()>0"
		   });			
		addAnnotation
		  (ordenacionEClass, 
		   source, 
		   new String[] {
			 "uniqueAnswer", "\n\t\t\tcorrectas->size()=1"
		   });
	}

} //AutoevaluacionPackageImpl
