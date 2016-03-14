/**
 */
package graphdb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link graphdb.GraphElement#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see graphdb.GraphdbPackage#getGraphElement()
 * @model abstract="true"
 * @generated
 */
public interface GraphElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link graphdb.Property}.
	 * It is bidirectional and its opposite is '{@link graphdb.Property#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see graphdb.GraphdbPackage#getGraphElement_Properties()
	 * @see graphdb.Property#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // GraphElement
