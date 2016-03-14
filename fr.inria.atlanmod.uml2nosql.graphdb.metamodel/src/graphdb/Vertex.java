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
 * </p>
 * <ul>
 *   <li>{@link graphdb.Vertex#getInEdges <em>In Edges</em>}</li>
 *   <li>{@link graphdb.Vertex#getOutEdges <em>Out Edges</em>}</li>
 *   <li>{@link graphdb.Vertex#getLabels <em>Labels</em>}</li>
 *   <li>{@link graphdb.Vertex#getName <em>Name</em>}</li>
 *   <li>{@link graphdb.Vertex#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see graphdb.GraphdbPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends GraphElement {
	/**
	 * Returns the value of the '<em><b>In Edges</b></em>' reference list.
	 * The list contents are of type {@link graphdb.Edge}.
	 * It is bidirectional and its opposite is '{@link graphdb.Edge#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Edges</em>' reference list.
	 * @see graphdb.GraphdbPackage#getVertex_InEdges()
	 * @see graphdb.Edge#getHead
	 * @model opposite="head"
	 * @generated
	 */
	EList<Edge> getInEdges();

	/**
	 * Returns the value of the '<em><b>Out Edges</b></em>' reference list.
	 * The list contents are of type {@link graphdb.Edge}.
	 * It is bidirectional and its opposite is '{@link graphdb.Edge#getTail <em>Tail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Edges</em>' reference list.
	 * @see graphdb.GraphdbPackage#getVertex_OutEdges()
	 * @see graphdb.Edge#getTail
	 * @model opposite="tail"
	 * @generated
	 */
	EList<Edge> getOutEdges();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see graphdb.GraphdbPackage#getVertex_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see graphdb.GraphdbPackage#getVertex_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link graphdb.Vertex#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link graphdb.Graph#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see graphdb.GraphdbPackage#getVertex_Graph()
	 * @see graphdb.Graph#getVertices
	 * @model opposite="vertices" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link graphdb.Vertex#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

} // Vertex
