/**
 */
package graphdb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link graphdb.Edge#getTail <em>Tail</em>}</li>
 *   <li>{@link graphdb.Edge#getHead <em>Head</em>}</li>
 *   <li>{@link graphdb.Edge#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see graphdb.GraphdbPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Tail</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link graphdb.Vertex#getOutEdges <em>Out Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tail</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tail</em>' container reference.
	 * @see #setTail(Vertex)
	 * @see graphdb.GraphdbPackage#getEdge_Tail()
	 * @see graphdb.Vertex#getOutEdges
	 * @model opposite="outEdges" transient="false"
	 * @generated
	 */
	Vertex getTail();

	/**
	 * Sets the value of the '{@link graphdb.Edge#getTail <em>Tail</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tail</em>' container reference.
	 * @see #getTail()
	 * @generated
	 */
	void setTail(Vertex value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link graphdb.Vertex#getInEdges <em>In Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' container reference.
	 * @see #setHead(Vertex)
	 * @see graphdb.GraphdbPackage#getEdge_Head()
	 * @see graphdb.Vertex#getInEdges
	 * @model opposite="inEdges" transient="false"
	 * @generated
	 */
	Vertex getHead();

	/**
	 * Sets the value of the '{@link graphdb.Edge#getHead <em>Head</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' container reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(Vertex value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see graphdb.GraphdbPackage#getEdge_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link graphdb.Edge#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Edge
