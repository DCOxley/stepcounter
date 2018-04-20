/**
 */
package oxley.dave.fun.sport.stepcounter;

import org.eclipse.emf.ecore.EFactory;

import oxley.dave.fun.sport.stepcounter.api.Cycle;
import oxley.dave.fun.sport.stepcounter.api.Day;
import oxley.dave.fun.sport.stepcounter.api.Punishment;
import oxley.dave.fun.sport.stepcounter.api.Result;
import oxley.dave.fun.sport.stepcounter.api.Reward;
import oxley.dave.fun.sport.stepcounter.api.SportTarget;
import oxley.dave.fun.sport.stepcounter.api.Status;
import oxley.dave.fun.sport.stepcounter.api.StepTarget;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see oxley.dave.fun.sport.stepcounter.StepcounterPackage
 * @generated
 */
public interface StepcounterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepcounterFactory eINSTANCE = oxley.dave.fun.sport.stepcounter.impl.StepcounterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day</em>'.
	 * @generated
	 */
	Day createDay();

	/**
	 * Returns a new object of class '<em>Cycle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cycle</em>'.
	 * @generated
	 */
	Cycle createCycle();

	/**
	 * Returns a new object of class '<em>Step Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Target</em>'.
	 * @generated
	 */
	StepTarget createStepTarget();

	/**
	 * Returns a new object of class '<em>Sport Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sport Target</em>'.
	 * @generated
	 */
	SportTarget createSportTarget();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	Status createStatus();

	/**
	 * Returns a new object of class '<em>Punishment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Punishment</em>'.
	 * @generated
	 */
	Punishment createPunishment();

	/**
	 * Returns a new object of class '<em>Reward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reward</em>'.
	 * @generated
	 */
	Reward createReward();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	Result createResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepcounterPackage getStepcounterPackage();

} //StepcounterFactory
