/**
 */
package oxley.dave.fun.sport.stepcounter.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import oxley.dave.fun.sport.stepcounter.StepcounterPackage;

import oxley.dave.fun.sport.stepcounter.api.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see oxley.dave.fun.sport.stepcounter.StepcounterPackage
 * @generated
 */
public class StepcounterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepcounterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepcounterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StepcounterPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepcounterSwitch<Adapter> modelSwitch =
		new StepcounterSwitch<Adapter>() {
			@Override
			public Adapter caseDay(Day object) {
				return createDayAdapter();
			}
			@Override
			public Adapter caseCycle(Cycle object) {
				return createCycleAdapter();
			}
			@Override
			public Adapter caseTarget(Target object) {
				return createTargetAdapter();
			}
			@Override
			public Adapter caseStepTarget(StepTarget object) {
				return createStepTargetAdapter();
			}
			@Override
			public Adapter caseSportTarget(SportTarget object) {
				return createSportTargetAdapter();
			}
			@Override
			public Adapter caseStatus(Status object) {
				return createStatusAdapter();
			}
			@Override
			public Adapter casePunishment(Punishment object) {
				return createPunishmentAdapter();
			}
			@Override
			public Adapter caseReward(Reward object) {
				return createRewardAdapter();
			}
			@Override
			public Adapter caseResult(Result object) {
				return createResultAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link oxley.dave.fun.sport.stepcounter.api.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oxley.dave.fun.sport.stepcounter.api.Day
	 * @generated
	 */
	public Adapter createDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oxley.dave.fun.sport.stepcounter.api.Cycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oxley.dave.fun.sport.stepcounter.api.Cycle
	 * @generated
	 */
	public Adapter createCycleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oxley.dave.fun.sport.stepcounter.api.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oxley.dave.fun.sport.stepcounter.api.Target
	 * @generated
	 */
	public Adapter createTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oxley.dave.fun.sport.stepcounter.api.StepTarget <em>Step Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oxley.dave.fun.sport.stepcounter.api.StepTarget
	 * @generated
	 */
	public Adapter createStepTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oxley.dave.fun.sport.stepcounter.api.SportTarget <em>Sport Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oxley.dave.fun.sport.stepcounter.api.SportTarget
	 * @generated
	 */
	public Adapter createSportTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oxley.dave.fun.sport.stepcounter.api.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oxley.dave.fun.sport.stepcounter.api.Status
	 * @generated
	 */
	public Adapter createStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oxley.dave.fun.sport.stepcounter.api.Punishment <em>Punishment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oxley.dave.fun.sport.stepcounter.api.Punishment
	 * @generated
	 */
	public Adapter createPunishmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oxley.dave.fun.sport.stepcounter.api.Reward <em>Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oxley.dave.fun.sport.stepcounter.api.Reward
	 * @generated
	 */
	public Adapter createRewardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oxley.dave.fun.sport.stepcounter.api.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oxley.dave.fun.sport.stepcounter.api.Result
	 * @generated
	 */
	public Adapter createResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StepcounterAdapterFactory
