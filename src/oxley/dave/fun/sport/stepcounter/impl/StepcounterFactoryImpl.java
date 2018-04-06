/**
 */
package oxley.dave.fun.sport.stepcounter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import oxley.dave.fun.sport.stepcounter.StepcounterFactory;
import oxley.dave.fun.sport.stepcounter.StepcounterPackage;

import oxley.dave.fun.sport.stepcounter.api.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepcounterFactoryImpl extends EFactoryImpl implements StepcounterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepcounterFactory init() {
		try {
			StepcounterFactory theStepcounterFactory = (StepcounterFactory)EPackage.Registry.INSTANCE.getEFactory(StepcounterPackage.eNS_URI);
			if (theStepcounterFactory != null) {
				return theStepcounterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepcounterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepcounterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StepcounterPackage.DAY: return createDay();
			case StepcounterPackage.CYCLE: return createCycle();
			case StepcounterPackage.TARGET: return createTarget();
			case StepcounterPackage.STEP_TARGET: return createStepTarget();
			case StepcounterPackage.SPORT_TARGET: return createSportTarget();
			case StepcounterPackage.STATUS: return createStatus();
			case StepcounterPackage.PUNISHMENT: return createPunishment();
			case StepcounterPackage.REWARD: return createReward();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Day createDay() {
		DayImpl day = new DayImpl();
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cycle createCycle() {
		CycleImpl cycle = new CycleImpl();
		return cycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target createTarget() {
		TargetImpl target = new TargetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepTarget createStepTarget() {
		StepTargetImpl stepTarget = new StepTargetImpl();
		return stepTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SportTarget createSportTarget() {
		SportTargetImpl sportTarget = new SportTargetImpl();
		return sportTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Punishment createPunishment() {
		PunishmentImpl punishment = new PunishmentImpl();
		return punishment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reward createReward() {
		RewardImpl reward = new RewardImpl();
		return reward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepcounterPackage getStepcounterPackage() {
		return (StepcounterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepcounterPackage getPackage() {
		return StepcounterPackage.eINSTANCE;
	}

} //StepcounterFactoryImpl
