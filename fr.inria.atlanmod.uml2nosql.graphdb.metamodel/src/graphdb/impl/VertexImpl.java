/**
 */
package graphdb.impl;

import graphdb.Edge;
import graphdb.GraphdbPackage;
import graphdb.Vertex;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphdb.impl.VertexImpl#getInEdges <em>In Edges</em>}</li>
 *   <li>{@link graphdb.impl.VertexImpl#getOutEdges <em>Out Edges</em>}</li>
 *   <li>{@link graphdb.impl.VertexImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VertexImpl extends GraphElementImpl implements Vertex {
	/**
	 * The cached value of the '{@link #getInEdges() <em>In Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> inEdges;

	/**
	 * The cached value of the '{@link #getOutEdges() <em>Out Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> outEdges;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<String> labels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphdbPackage.Literals.VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getInEdges() {
		if (inEdges == null) {
			inEdges = new EObjectContainmentWithInverseEList<Edge>(Edge.class, this, GraphdbPackage.VERTEX__IN_EDGES, GraphdbPackage.EDGE__HEAD);
		}
		return inEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getOutEdges() {
		if (outEdges == null) {
			outEdges = new EObjectContainmentWithInverseEList<Edge>(Edge.class, this, GraphdbPackage.VERTEX__OUT_EDGES, GraphdbPackage.EDGE__TAIL);
		}
		return outEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLabels() {
		if (labels == null) {
			labels = new EDataTypeUniqueEList<String>(String.class, this, GraphdbPackage.VERTEX__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphdbPackage.VERTEX__IN_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInEdges()).basicAdd(otherEnd, msgs);
			case GraphdbPackage.VERTEX__OUT_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutEdges()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphdbPackage.VERTEX__IN_EDGES:
				return ((InternalEList<?>)getInEdges()).basicRemove(otherEnd, msgs);
			case GraphdbPackage.VERTEX__OUT_EDGES:
				return ((InternalEList<?>)getOutEdges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphdbPackage.VERTEX__IN_EDGES:
				return getInEdges();
			case GraphdbPackage.VERTEX__OUT_EDGES:
				return getOutEdges();
			case GraphdbPackage.VERTEX__LABELS:
				return getLabels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphdbPackage.VERTEX__IN_EDGES:
				getInEdges().clear();
				getInEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case GraphdbPackage.VERTEX__OUT_EDGES:
				getOutEdges().clear();
				getOutEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case GraphdbPackage.VERTEX__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphdbPackage.VERTEX__IN_EDGES:
				getInEdges().clear();
				return;
			case GraphdbPackage.VERTEX__OUT_EDGES:
				getOutEdges().clear();
				return;
			case GraphdbPackage.VERTEX__LABELS:
				getLabels().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphdbPackage.VERTEX__IN_EDGES:
				return inEdges != null && !inEdges.isEmpty();
			case GraphdbPackage.VERTEX__OUT_EDGES:
				return outEdges != null && !outEdges.isEmpty();
			case GraphdbPackage.VERTEX__LABELS:
				return labels != null && !labels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (labels: ");
		result.append(labels);
		result.append(')');
		return result.toString();
	}

} //VertexImpl
