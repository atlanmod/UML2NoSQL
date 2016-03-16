/**
 */
package graphdbMapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphdbMapping.MappingDefinition#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 *
 * @see graphdbMapping.GraphdbMappingPackage#getMappingDefinition()
 * @model
 * @generated
 */
public interface MappingDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link graphdbMapping.Mapping}.
	 * It is bidirectional and its opposite is '{@link graphdbMapping.Mapping#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see graphdbMapping.GraphdbMappingPackage#getMappingDefinition_Definitions()
	 * @see graphdbMapping.Mapping#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Mapping> getDefinitions();

} // MappingDefinition
