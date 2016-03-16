/**
 */
package graphdbMapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see graphdbMapping.GraphdbMappingPackage
 * @generated
 */
public interface GraphdbMappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphdbMappingFactory eINSTANCE = graphdbMapping.impl.GraphdbMappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mapping Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Definition</em>'.
	 * @generated
	 */
	MappingDefinition createMappingDefinition();

	/**
	 * Returns a new object of class '<em>Class Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Mapping</em>'.
	 * @generated
	 */
	ClassMapping createClassMapping();

	/**
	 * Returns a new object of class '<em>Property Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Mapping</em>'.
	 * @generated
	 */
	PropertyMapping createPropertyMapping();

	/**
	 * Returns a new object of class '<em>Association Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Mapping</em>'.
	 * @generated
	 */
	AssociationMapping createAssociationMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GraphdbMappingPackage getGraphdbMappingPackage();

} //GraphdbMappingFactory
