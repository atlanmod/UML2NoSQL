/**
 */
package graphdbMapping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see graphdbMapping.GraphdbMappingFactory
 * @model kind="package"
 * @generated
 */
public interface GraphdbMappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphdbMapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fr.inria.atlanmod.uml2nosql.graphdb.mapping.metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphdbMapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphdbMappingPackage eINSTANCE = graphdbMapping.impl.GraphdbMappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link graphdbMapping.impl.MappingDefinitionImpl <em>Mapping Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphdbMapping.impl.MappingDefinitionImpl
	 * @see graphdbMapping.impl.GraphdbMappingPackageImpl#getMappingDefinition()
	 * @generated
	 */
	int MAPPING_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DEFINITION__DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>Mapping Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mapping Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphdbMapping.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphdbMapping.impl.MappingImpl
	 * @see graphdbMapping.impl.GraphdbMappingPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Uml Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__UML_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Graph Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__GRAPH_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link graphdbMapping.impl.ClassMappingImpl <em>Class Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphdbMapping.impl.ClassMappingImpl
	 * @see graphdbMapping.impl.GraphdbMappingPackageImpl#getClassMapping()
	 * @generated
	 */
	int CLASS_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Uml Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING__UML_ELEMENTS = MAPPING__UML_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Graph Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING__GRAPH_ELEMENTS = MAPPING__GRAPH_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING__PARENT = MAPPING__PARENT;

	/**
	 * The number of structural features of the '<em>Class Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link graphdbMapping.impl.PropertyMappingImpl <em>Property Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphdbMapping.impl.PropertyMappingImpl
	 * @see graphdbMapping.impl.GraphdbMappingPackageImpl#getPropertyMapping()
	 * @generated
	 */
	int PROPERTY_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Uml Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPING__UML_ELEMENTS = MAPPING__UML_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Graph Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPING__GRAPH_ELEMENTS = MAPPING__GRAPH_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPING__PARENT = MAPPING__PARENT;

	/**
	 * The number of structural features of the '<em>Property Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Property Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link graphdbMapping.impl.AssociationMappingImpl <em>Association Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphdbMapping.impl.AssociationMappingImpl
	 * @see graphdbMapping.impl.GraphdbMappingPackageImpl#getAssociationMapping()
	 * @generated
	 */
	int ASSOCIATION_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Uml Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MAPPING__UML_ELEMENTS = MAPPING__UML_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Graph Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MAPPING__GRAPH_ELEMENTS = MAPPING__GRAPH_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MAPPING__PARENT = MAPPING__PARENT;

	/**
	 * The number of structural features of the '<em>Association Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Association Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link graphdbMapping.MappingDefinition <em>Mapping Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Definition</em>'.
	 * @see graphdbMapping.MappingDefinition
	 * @generated
	 */
	EClass getMappingDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link graphdbMapping.MappingDefinition#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see graphdbMapping.MappingDefinition#getDefinitions()
	 * @see #getMappingDefinition()
	 * @generated
	 */
	EReference getMappingDefinition_Definitions();

	/**
	 * Returns the meta object for class '{@link graphdbMapping.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see graphdbMapping.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the reference list '{@link graphdbMapping.Mapping#getUmlElements <em>Uml Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uml Elements</em>'.
	 * @see graphdbMapping.Mapping#getUmlElements()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_UmlElements();

	/**
	 * Returns the meta object for the reference list '{@link graphdbMapping.Mapping#getGraphElements <em>Graph Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Graph Elements</em>'.
	 * @see graphdbMapping.Mapping#getGraphElements()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_GraphElements();

	/**
	 * Returns the meta object for the container reference '{@link graphdbMapping.Mapping#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see graphdbMapping.Mapping#getParent()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Parent();

	/**
	 * Returns the meta object for class '{@link graphdbMapping.ClassMapping <em>Class Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Mapping</em>'.
	 * @see graphdbMapping.ClassMapping
	 * @generated
	 */
	EClass getClassMapping();

	/**
	 * Returns the meta object for class '{@link graphdbMapping.PropertyMapping <em>Property Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Mapping</em>'.
	 * @see graphdbMapping.PropertyMapping
	 * @generated
	 */
	EClass getPropertyMapping();

	/**
	 * Returns the meta object for class '{@link graphdbMapping.AssociationMapping <em>Association Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Mapping</em>'.
	 * @see graphdbMapping.AssociationMapping
	 * @generated
	 */
	EClass getAssociationMapping();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphdbMappingFactory getGraphdbMappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link graphdbMapping.impl.MappingDefinitionImpl <em>Mapping Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphdbMapping.impl.MappingDefinitionImpl
		 * @see graphdbMapping.impl.GraphdbMappingPackageImpl#getMappingDefinition()
		 * @generated
		 */
		EClass MAPPING_DEFINITION = eINSTANCE.getMappingDefinition();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_DEFINITION__DEFINITIONS = eINSTANCE.getMappingDefinition_Definitions();

		/**
		 * The meta object literal for the '{@link graphdbMapping.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphdbMapping.impl.MappingImpl
		 * @see graphdbMapping.impl.GraphdbMappingPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Uml Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__UML_ELEMENTS = eINSTANCE.getMapping_UmlElements();

		/**
		 * The meta object literal for the '<em><b>Graph Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__GRAPH_ELEMENTS = eINSTANCE.getMapping_GraphElements();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__PARENT = eINSTANCE.getMapping_Parent();

		/**
		 * The meta object literal for the '{@link graphdbMapping.impl.ClassMappingImpl <em>Class Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphdbMapping.impl.ClassMappingImpl
		 * @see graphdbMapping.impl.GraphdbMappingPackageImpl#getClassMapping()
		 * @generated
		 */
		EClass CLASS_MAPPING = eINSTANCE.getClassMapping();

		/**
		 * The meta object literal for the '{@link graphdbMapping.impl.PropertyMappingImpl <em>Property Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphdbMapping.impl.PropertyMappingImpl
		 * @see graphdbMapping.impl.GraphdbMappingPackageImpl#getPropertyMapping()
		 * @generated
		 */
		EClass PROPERTY_MAPPING = eINSTANCE.getPropertyMapping();

		/**
		 * The meta object literal for the '{@link graphdbMapping.impl.AssociationMappingImpl <em>Association Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphdbMapping.impl.AssociationMappingImpl
		 * @see graphdbMapping.impl.GraphdbMappingPackageImpl#getAssociationMapping()
		 * @generated
		 */
		EClass ASSOCIATION_MAPPING = eINSTANCE.getAssociationMapping();

	}

} //GraphdbMappingPackage
