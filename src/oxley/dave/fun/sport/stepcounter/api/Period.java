/**
 */
package oxley.dave.fun.sport.stepcounter.api;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oxley.dave.fun.sport.stepcounter.api.Period#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see oxley.dave.fun.sport.stepcounter.StepcounterPackage#getPeriod()
 * @model abstract="true"
 * @generated
 */
public interface Period extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see oxley.dave.fun.sport.stepcounter.StepcounterPackage#getPeriod_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link oxley.dave.fun.sport.stepcounter.api.Period#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // Period
