/**
 */
package oxley.dave.fun.sport.stepcounter.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import oxley.dave.fun.sport.stepcounter.StepcounterPackage;

import oxley.dave.fun.sport.stepcounter.api.Cycle;
import oxley.dave.fun.sport.stepcounter.api.Day;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oxley.dave.fun.sport.stepcounter.impl.CycleImpl#getDays <em>Days</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CycleImpl extends PeriodImpl implements Cycle {
	/**
	 * The cached value of the '{@link #getDays() <em>Days</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
	protected EList<Day> days;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CycleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepcounterPackage.Literals.CYCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Day> getDays() {
		if (days == null) {
			days = new EObjectResolvingEList<Day>(Day.class, this, StepcounterPackage.CYCLE__DAYS);
		}
		return days;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StepcounterPackage.CYCLE__DAYS:
				return getDays();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StepcounterPackage.CYCLE__DAYS:
				getDays().clear();
				getDays().addAll((Collection<? extends Day>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StepcounterPackage.CYCLE__DAYS:
				getDays().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StepcounterPackage.CYCLE__DAYS:
				return days != null && !days.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CycleImpl
