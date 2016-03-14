/**
 */
package graphdb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link graphdb.Vertex#getInEdges <em>In Edges</em>}</li>
 *   <li>{@link graphdb.Vertex#getOutEdges <em>Out Edges</em>}</li>
 *   <li>{@link graphdb.Vertex#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see graphdb.GraphdbPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends GraphElement {
	/**
	 * Returns the value of the '<em><b>In Edges</b></em>' containment reference list.
	 * The list contents are of type {@link graphdb.Edge}.
	 * It is bidirectional and its opposite is '{@link graphdb.Edge#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Edges</em>' containment reference list.
	 * @see graphdb.GraphdbPackage#getVertex_InEdges()
	 * @see graphdb.Edge#getHead
	 * @model opposite="head" containment="true"
	 * @generated
	 */
	EList<Edge> getInEdges();

	/**
	 * Returns the value of the '<em><b>Out Edges</b></em>' containment reference list.
	 * The list contents are of type {@link graphdb.Edge}.
	 * It is bidirectional and its opposite is '{@link graphdb.Edge#getTail <em>Tail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Edges</em>' containment reference list.
	 * @see graphdb.GraphdbPackage#getVertex_OutEdges()
	 * @see graphdb.Edge#getTail
	 * @model opposite="tail" containment="true"
	 * @generated
	 */
	EList<Edge> getOutEdges();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute list.
	 * @see graphdb.GraphdbPackage#getVertex_Label()
	 * @model
	 * @generated
	 */
	EList<String> getLabel();

} // Vertex
