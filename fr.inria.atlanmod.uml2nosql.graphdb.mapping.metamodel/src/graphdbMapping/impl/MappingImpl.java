/**
 */
package graphdbMapping.impl;

import graphdbMapping.GraphdbMappingPackage;
import graphdbMapping.Mapping;

import graphdbMapping.MappingDefinition;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphdbMapping.impl.MappingImpl#getUmlElements <em>Uml Elements</em>}</li>
 *   <li>{@link graphdbMapping.impl.MappingImpl#getGraphElements <em>Graph Elements</em>}</li>
 *   <li>{@link graphdbMapping.impl.MappingImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MappingImpl extends MinimalEObjectImpl.Container implements Mapping {
	/**
	 * The cached value of the '{@link #getUmlElements() <em>Uml Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> umlElements;

	/**
	 * The cached value of the '{@link #getGraphElements() <em>Graph Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphElements()
	 * @generated
	 * @ordered
	 */
	protected EList<graphdb.Element> graphElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphdbMappingPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getUmlElements() {
		if (umlElements == null) {
			umlElements = new EObjectResolvingEList<Element>(Element.class, this, GraphdbMappingPackage.MAPPING__UML_ELEMENTS);
		}
		return umlElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<graphdb.Element> getGraphElements() {
		if (graphElements == null) {
			graphElements = new EObjectResolvingEList<graphdb.Element>(graphdb.Element.class, this, GraphdbMappingPackage.MAPPING__GRAPH_ELEMENTS);
		}
		return graphElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingDefinition getParent() {
		if (eContainerFeatureID() != GraphdbMappingPackage.MAPPING__PARENT) return null;
		return (MappingDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(MappingDefinition newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, GraphdbMappingPackage.MAPPING__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(MappingDefinition newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != GraphdbMappingPackage.MAPPING__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, GraphdbMappingPackage.MAPPING_DEFINITION__DEFINITIONS, MappingDefinition.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphdbMappingPackage.MAPPING__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphdbMappingPackage.MAPPING__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((MappingDefinition)otherEnd, msgs);
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
			case GraphdbMappingPackage.MAPPING__PARENT:
				return basicSetParent(null, msgs);
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
			case GraphdbMappingPackage.MAPPING__PARENT:
				return eInternalContainer().eInverseRemove(this, GraphdbMappingPackage.MAPPING_DEFINITION__DEFINITIONS, MappingDefinition.class, msgs);
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
			case GraphdbMappingPackage.MAPPING__UML_ELEMENTS:
				return getUmlElements();
			case GraphdbMappingPackage.MAPPING__GRAPH_ELEMENTS:
				return getGraphElements();
			case GraphdbMappingPackage.MAPPING__PARENT:
				return getParent();
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
			case GraphdbMappingPackage.MAPPING__UML_ELEMENTS:
				getUmlElements().clear();
				getUmlElements().addAll((Collection<? extends Element>)newValue);
				return;
			case GraphdbMappingPackage.MAPPING__GRAPH_ELEMENTS:
				getGraphElements().clear();
				getGraphElements().addAll((Collection<? extends graphdb.Element>)newValue);
				return;
			case GraphdbMappingPackage.MAPPING__PARENT:
				setParent((MappingDefinition)newValue);
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
			case GraphdbMappingPackage.MAPPING__UML_ELEMENTS:
				getUmlElements().clear();
				return;
			case GraphdbMappingPackage.MAPPING__GRAPH_ELEMENTS:
				getGraphElements().clear();
				return;
			case GraphdbMappingPackage.MAPPING__PARENT:
				setParent((MappingDefinition)null);
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
			case GraphdbMappingPackage.MAPPING__UML_ELEMENTS:
				return umlElements != null && !umlElements.isEmpty();
			case GraphdbMappingPackage.MAPPING__GRAPH_ELEMENTS:
				return graphElements != null && !graphElements.isEmpty();
			case GraphdbMappingPackage.MAPPING__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingImpl
