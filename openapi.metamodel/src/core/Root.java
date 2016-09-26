/**
 */
package core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.Root#getApi <em>Api</em>}</li>
 *   <li>{@link core.Root#getParamters <em>Paramters</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' containment reference.
	 * @see #setApi(Api)
	 * @see core.CorePackage#getRoot_Api()
	 * @model containment="true"
	 * @generated
	 */
	Api getApi();

	/**
	 * Sets the value of the '{@link core.Root#getApi <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' containment reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(Api value);

	/**
	 * Returns the value of the '<em><b>Paramters</b></em>' containment reference list.
	 * The list contents are of type {@link core.APIParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paramters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paramters</em>' containment reference list.
	 * @see core.CorePackage#getRoot_Paramters()
	 * @model containment="true"
	 * @generated
	 */
	EList<APIParameter> getParamters();

} // Root