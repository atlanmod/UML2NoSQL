/**
 */
package graphdbMapping.impl;

import graphdbMapping.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphdbMappingFactoryImpl extends EFactoryImpl implements GraphdbMappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphdbMappingFactory init() {
		try {
			GraphdbMappingFactory theGraphdbMappingFactory = (GraphdbMappingFactory)EPackage.Registry.INSTANCE.getEFactory(GraphdbMappingPackage.eNS_URI);
			if (theGraphdbMappingFactory != null) {
				return theGraphdbMappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphdbMappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphdbMappingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GraphdbMappingPackage.MAPPING_DEFINITION: return createMappingDefinition();
			case GraphdbMappingPackage.CLASS_MAPPING: return createClassMapping();
			case GraphdbMappingPackage.PROPERTY_MAPPING: return createPropertyMapping();
			case GraphdbMappingPackage.ASSOCIATION_MAPPING: return createAssociationMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingDefinition createMappingDefinition() {
		MappingDefinitionImpl mappingDefinition = new MappingDefinitionImpl();
		return mappingDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMapping createClassMapping() {
		ClassMappingImpl classMapping = new ClassMappingImpl();
		return classMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyMapping createPropertyMapping() {
		PropertyMappingImpl propertyMapping = new PropertyMappingImpl();
		return propertyMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationMapping createAssociationMapping() {
		AssociationMappingImpl associationMapping = new AssociationMappingImpl();
		return associationMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphdbMappingPackage getGraphdbMappingPackage() {
		return (GraphdbMappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphdbMappingPackage getPackage() {
		return GraphdbMappingPackage.eINSTANCE;
	}

} //GraphdbMappingFactoryImpl
