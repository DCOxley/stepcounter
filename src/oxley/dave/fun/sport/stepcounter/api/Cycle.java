/**
 */
package oxley.dave.fun.sport.stepcounter.api;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cycle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oxley.dave.fun.sport.stepcounter.api.Cycle#getDays <em>Days</em>}</li>
 * </ul>
 *
 * @see oxley.dave.fun.sport.stepcounter.StepcounterPackage#getCycle()
 * @model
 * @generated
 */
public interface Cycle extends Period {

	/**
	 * Returns the value of the '<em><b>Days</b></em>' reference list.
	 * The list contents are of type {@link oxley.dave.fun.sport.stepcounter.api.Day}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days</em>' reference list.
	 * @see oxley.dave.fun.sport.stepcounter.StepcounterPackage#getCycle_Days()
	 * @model
	 * @generated
	 */
	EList<Day> getDays();
} // Cycle
