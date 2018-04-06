/**
 */
package oxley.dave.fun.sport.stepcounter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see oxley.dave.fun.sport.stepcounter.StepcounterFactory
 * @model kind="package"
 * @generated
 */
public interface StepcounterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stepcounter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "oxley.dave.fun.sport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oxley.dave.fun.sport.src";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepcounterPackage eINSTANCE = oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl.init();

	/**
	 * The meta object id for the '{@link oxley.dave.fun.sport.stepcounter.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oxley.dave.fun.sport.stepcounter.impl.DayImpl
	 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getDay()
	 * @generated
	 */
	int DAY = 0;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oxley.dave.fun.sport.stepcounter.impl.CycleImpl <em>Cycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oxley.dave.fun.sport.stepcounter.impl.CycleImpl
	 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getCycle()
	 * @generated
	 */
	int CYCLE = 1;

	/**
	 * The number of structural features of the '<em>Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oxley.dave.fun.sport.stepcounter.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oxley.dave.fun.sport.stepcounter.impl.TargetImpl
	 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 2;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oxley.dave.fun.sport.stepcounter.impl.StepTargetImpl <em>Step Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oxley.dave.fun.sport.stepcounter.impl.StepTargetImpl
	 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getStepTarget()
	 * @generated
	 */
	int STEP_TARGET = 3;

	/**
	 * The number of structural features of the '<em>Step Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TARGET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Step Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oxley.dave.fun.sport.stepcounter.impl.SportTargetImpl <em>Sport Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oxley.dave.fun.sport.stepcounter.impl.SportTargetImpl
	 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getSportTarget()
	 * @generated
	 */
	int SPORT_TARGET = 4;

	/**
	 * The number of structural features of the '<em>Sport Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_TARGET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sport Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oxley.dave.fun.sport.stepcounter.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oxley.dave.fun.sport.stepcounter.impl.StatusImpl
	 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 5;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oxley.dave.fun.sport.stepcounter.impl.PunishmentImpl <em>Punishment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oxley.dave.fun.sport.stepcounter.impl.PunishmentImpl
	 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getPunishment()
	 * @generated
	 */
	int PUNISHMENT = 6;

	/**
	 * The number of structural features of the '<em>Punishment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNISHMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Punishment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNISHMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oxley.dave.fun.sport.stepcounter.impl.RewardImpl <em>Reward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oxley.dave.fun.sport.stepcounter.impl.RewardImpl
	 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getReward()
	 * @generated
	 */
	int REWARD = 7;

	/**
	 * The number of structural features of the '<em>Reward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWARD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Reward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWARD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link oxley.dave.fun.sport.stepcounter.api.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for class '{@link oxley.dave.fun.sport.stepcounter.api.Cycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cycle</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Cycle
	 * @generated
	 */
	EClass getCycle();

	/**
	 * Returns the meta object for class '{@link oxley.dave.fun.sport.stepcounter.api.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for class '{@link oxley.dave.fun.sport.stepcounter.api.StepTarget <em>Step Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Target</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.StepTarget
	 * @generated
	 */
	EClass getStepTarget();

	/**
	 * Returns the meta object for class '{@link oxley.dave.fun.sport.stepcounter.api.SportTarget <em>Sport Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sport Target</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.SportTarget
	 * @generated
	 */
	EClass getSportTarget();

	/**
	 * Returns the meta object for class '{@link oxley.dave.fun.sport.stepcounter.api.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for class '{@link oxley.dave.fun.sport.stepcounter.api.Punishment <em>Punishment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Punishment</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Punishment
	 * @generated
	 */
	EClass getPunishment();

	/**
	 * Returns the meta object for class '{@link oxley.dave.fun.sport.stepcounter.api.Reward <em>Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reward</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Reward
	 * @generated
	 */
	EClass getReward();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepcounterFactory getStepcounterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link oxley.dave.fun.sport.stepcounter.impl.DayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oxley.dave.fun.sport.stepcounter.impl.DayImpl
		 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getDay()
		 * @generated
		 */
		EClass DAY = eINSTANCE.getDay();

		/**
		 * The meta object literal for the '{@link oxley.dave.fun.sport.stepcounter.impl.CycleImpl <em>Cycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oxley.dave.fun.sport.stepcounter.impl.CycleImpl
		 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getCycle()
		 * @generated
		 */
		EClass CYCLE = eINSTANCE.getCycle();

		/**
		 * The meta object literal for the '{@link oxley.dave.fun.sport.stepcounter.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oxley.dave.fun.sport.stepcounter.impl.TargetImpl
		 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '{@link oxley.dave.fun.sport.stepcounter.impl.StepTargetImpl <em>Step Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oxley.dave.fun.sport.stepcounter.impl.StepTargetImpl
		 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getStepTarget()
		 * @generated
		 */
		EClass STEP_TARGET = eINSTANCE.getStepTarget();

		/**
		 * The meta object literal for the '{@link oxley.dave.fun.sport.stepcounter.impl.SportTargetImpl <em>Sport Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oxley.dave.fun.sport.stepcounter.impl.SportTargetImpl
		 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getSportTarget()
		 * @generated
		 */
		EClass SPORT_TARGET = eINSTANCE.getSportTarget();

		/**
		 * The meta object literal for the '{@link oxley.dave.fun.sport.stepcounter.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oxley.dave.fun.sport.stepcounter.impl.StatusImpl
		 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link oxley.dave.fun.sport.stepcounter.impl.PunishmentImpl <em>Punishment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oxley.dave.fun.sport.stepcounter.impl.PunishmentImpl
		 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getPunishment()
		 * @generated
		 */
		EClass PUNISHMENT = eINSTANCE.getPunishment();

		/**
		 * The meta object literal for the '{@link oxley.dave.fun.sport.stepcounter.impl.RewardImpl <em>Reward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oxley.dave.fun.sport.stepcounter.impl.RewardImpl
		 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getReward()
		 * @generated
		 */
		EClass REWARD = eINSTANCE.getReward();

	}

} //StepcounterPackage
