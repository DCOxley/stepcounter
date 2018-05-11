/**
 */
package oxley.dave.fun.sport.stepcounter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	 * The meta object id for the '{@link oxley.dave.fun.sport.stepcounter.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oxley.dave.fun.sport.stepcounter.impl.PeriodImpl
	 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 9;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__STATUS = PERIOD__STATUS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__TARGET = PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__RESULT = PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__DATE = PERIOD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = PERIOD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OPERATION_COUNT = PERIOD_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__STATUS = PERIOD__STATUS;

	/**
	 * The feature id for the '<em><b>Days</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__DAYS = PERIOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_FEATURE_COUNT = PERIOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_OPERATION_COUNT = PERIOD_OPERATION_COUNT + 0;

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
	int STEP_TARGET_FEATURE_COUNT = TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Step Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TARGET_OPERATION_COUNT = TARGET_OPERATION_COUNT + 0;

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
	int SPORT_TARGET_FEATURE_COUNT = TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sport Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_TARGET_OPERATION_COUNT = TARGET_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link oxley.dave.fun.sport.stepcounter.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oxley.dave.fun.sport.stepcounter.impl.ResultImpl
	 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 8;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NUMBER_OF_STEPS = 0;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 10;


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
	 * Returns the meta object for the reference '{@link oxley.dave.fun.sport.stepcounter.api.Day#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Day#getTarget()
	 * @see #getDay()
	 * @generated
	 */
	EReference getDay_Target();

	/**
	 * Returns the meta object for the reference '{@link oxley.dave.fun.sport.stepcounter.api.Day#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Day#getResult()
	 * @see #getDay()
	 * @generated
	 */
	EReference getDay_Result();

	/**
	 * Returns the meta object for the attribute '{@link oxley.dave.fun.sport.stepcounter.api.Day#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Day#getDate()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_Date();

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
	 * Returns the meta object for the reference list '{@link oxley.dave.fun.sport.stepcounter.api.Cycle#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Days</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Cycle#getDays()
	 * @see #getCycle()
	 * @generated
	 */
	EReference getCycle_Days();

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
	 * Returns the meta object for class '{@link oxley.dave.fun.sport.stepcounter.api.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the attribute '{@link oxley.dave.fun.sport.stepcounter.api.Result#getNumberOfSteps <em>Number Of Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Steps</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Result#getNumberOfSteps()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_NumberOfSteps();

	/**
	 * Returns the meta object for class '{@link oxley.dave.fun.sport.stepcounter.api.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the reference '{@link oxley.dave.fun.sport.stepcounter.api.Period#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see oxley.dave.fun.sport.stepcounter.api.Period#getStatus()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_Status();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

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
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAY__TARGET = eINSTANCE.getDay_Target();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAY__RESULT = eINSTANCE.getDay_Result();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__DATE = eINSTANCE.getDay_Date();

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
		 * The meta object literal for the '<em><b>Days</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYCLE__DAYS = eINSTANCE.getCycle_Days();

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

		/**
		 * The meta object literal for the '{@link oxley.dave.fun.sport.stepcounter.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oxley.dave.fun.sport.stepcounter.impl.ResultImpl
		 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Number Of Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__NUMBER_OF_STEPS = eINSTANCE.getResult_NumberOfSteps();

		/**
		 * The meta object literal for the '{@link oxley.dave.fun.sport.stepcounter.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oxley.dave.fun.sport.stepcounter.impl.PeriodImpl
		 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__STATUS = eINSTANCE.getPeriod_Status();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see oxley.dave.fun.sport.stepcounter.impl.StepcounterPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //StepcounterPackage
