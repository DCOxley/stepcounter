/**
 */
package oxley.dave.fun.sport.stepcounter.api;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oxley.dave.fun.sport.stepcounter.api.Result#getNumberOfSteps <em>Number Of Steps</em>}</li>
 * </ul>
 *
 * @see oxley.dave.fun.sport.stepcounter.StepcounterPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Steps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Steps</em>' attribute.
	 * @see #setNumberOfSteps(int)
	 * @see oxley.dave.fun.sport.stepcounter.StepcounterPackage#getResult_NumberOfSteps()
	 * @model
	 * @generated
	 */
	int getNumberOfSteps();

	/**
	 * Sets the value of the '{@link oxley.dave.fun.sport.stepcounter.api.Result#getNumberOfSteps <em>Number Of Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Steps</em>' attribute.
	 * @see #getNumberOfSteps()
	 * @generated
	 */
	void setNumberOfSteps(int value);

} // Result
