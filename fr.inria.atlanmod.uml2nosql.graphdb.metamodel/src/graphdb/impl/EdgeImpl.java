/**
 */
package graphdb.impl;

import graphdb.Edge;
import graphdb.GraphdbPackage;
import graphdb.Vertex;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphdb.impl.EdgeImpl#getTail <em>Tail</em>}</li>
 *   <li>{@link graphdb.impl.EdgeImpl#getHead <em>Head</em>}</li>
 *   <li>{@link graphdb.impl.EdgeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends GraphElementImpl implements Edge {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphdbPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getTail() {
		if (eContainerFeatureID() != GraphdbPackage.EDGE__TAIL) return null;
		return (Vertex)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTail(Vertex newTail, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTail, GraphdbPackage.EDGE__TAIL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTail(Vertex newTail) {
		if (newTail != eInternalContainer() || (eContainerFeatureID() != GraphdbPackage.EDGE__TAIL && newTail != null)) {
			if (EcoreUtil.isAncestor(this, newTail))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTail != null)
				msgs = ((InternalEObject)newTail).eInverseAdd(this, GraphdbPackage.VERTEX__OUT_EDGES, Vertex.class, msgs);
			msgs = basicSetTail(newTail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphdbPackage.EDGE__TAIL, newTail, newTail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getHead() {
		if (eContainerFeatureID() != GraphdbPackage.EDGE__HEAD) return null;
		return (Vertex)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(Vertex newHead, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHead, GraphdbPackage.EDGE__HEAD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(Vertex newHead) {
		if (newHead != eInternalContainer() || (eContainerFeatureID() != GraphdbPackage.EDGE__HEAD && newHead != null)) {
			if (EcoreUtil.isAncestor(this, newHead))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHead != null)
				msgs = ((InternalEObject)newHead).eInverseAdd(this, GraphdbPackage.VERTEX__IN_EDGES, Vertex.class, msgs);
			msgs = basicSetHead(newHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphdbPackage.EDGE__HEAD, newHead, newHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphdbPackage.EDGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphdbPackage.EDGE__TAIL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTail((Vertex)otherEnd, msgs);
			case GraphdbPackage.EDGE__HEAD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHead((Vertex)otherEnd, msgs);
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
			case GraphdbPackage.EDGE__TAIL:
				return basicSetTail(null, msgs);
			case GraphdbPackage.EDGE__HEAD:
				return basicSetHead(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GraphdbPackage.EDGE__TAIL:
				return eInternalContainer().eInverseRemove(this, GraphdbPackage.VERTEX__OUT_EDGES, Vertex.class, msgs);
			case GraphdbPackage.EDGE__HEAD:
				return eInternalContainer().eInverseRemove(this, GraphdbPackage.VERTEX__IN_EDGES, Vertex.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphdbPackage.EDGE__TAIL:
				return getTail();
			case GraphdbPackage.EDGE__HEAD:
				return getHead();
			case GraphdbPackage.EDGE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphdbPackage.EDGE__TAIL:
				setTail((Vertex)newValue);
				return;
			case GraphdbPackage.EDGE__HEAD:
				setHead((Vertex)newValue);
				return;
			case GraphdbPackage.EDGE__TYPE:
				setType((String)newValue);
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
			case GraphdbPackage.EDGE__TAIL:
				setTail((Vertex)null);
				return;
			case GraphdbPackage.EDGE__HEAD:
				setHead((Vertex)null);
				return;
			case GraphdbPackage.EDGE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case GraphdbPackage.EDGE__TAIL:
				return getTail() != null;
			case GraphdbPackage.EDGE__HEAD:
				return getHead() != null;
			case GraphdbPackage.EDGE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
