/**
 */
package oxley.dave.fun.sport.stepcounter.api;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oxley.dave.fun.sport.stepcounter.api.Day#getTarget <em>Target</em>}</li>
 *   <li>{@link oxley.dave.fun.sport.stepcounter.api.Day#getResult <em>Result</em>}</li>
 *   <li>{@link oxley.dave.fun.sport.stepcounter.api.Day#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see oxley.dave.fun.sport.stepcounter.StepcounterPackage#getDay()
 * @model
 * @generated
 */
public interface Day extends Period {

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Target)
	 * @see oxley.dave.fun.sport.stepcounter.StepcounterPackage#getDay_Target()
	 * @model
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link oxley.dave.fun.sport.stepcounter.api.Day#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Result)
	 * @see oxley.dave.fun.sport.stepcounter.StepcounterPackage#getDay_Result()
	 * @model
	 * @generated
	 */
	Result getResult();

	/**
	 * Sets the value of the '{@link oxley.dave.fun.sport.stepcounter.api.Day#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Result value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see oxley.dave.fun.sport.stepcounter.StepcounterPackage#getDay_Date()
	 * @model dataType="oxley.dave.fun.sport.stepcounter.api.Date"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link oxley.dave.fun.sport.stepcounter.api.Day#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);
} // Day
