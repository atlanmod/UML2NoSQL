/**
 */
package graphdbMapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphdbMapping.Mapping#getUmlElements <em>Uml Elements</em>}</li>
 *   <li>{@link graphdbMapping.Mapping#getGraphElements <em>Graph Elements</em>}</li>
 *   <li>{@link graphdbMapping.Mapping#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see graphdbMapping.GraphdbMappingPackage#getMapping()
 * @model abstract="true"
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Uml Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Elements</em>' reference list.
	 * @see graphdbMapping.GraphdbMappingPackage#getMapping_UmlElements()
	 * @model
	 * @generated
	 */
	EList<Element> getUmlElements();

	/**
	 * Returns the value of the '<em><b>Graph Elements</b></em>' reference list.
	 * The list contents are of type {@link graphdb.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Elements</em>' reference list.
	 * @see graphdbMapping.GraphdbMappingPackage#getMapping_GraphElements()
	 * @model
	 * @generated
	 */
	EList<graphdb.Element> getGraphElements();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link graphdbMapping.MappingDefinition#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(MappingDefinition)
	 * @see graphdbMapping.GraphdbMappingPackage#getMapping_Parent()
	 * @see graphdbMapping.MappingDefinition#getDefinitions
	 * @model opposite="definitions" transient="false"
	 * @generated
	 */
	MappingDefinition getParent();

	/**
	 * Sets the value of the '{@link graphdbMapping.Mapping#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(MappingDefinition value);

} // Mapping
