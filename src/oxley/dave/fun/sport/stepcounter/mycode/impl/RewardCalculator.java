package oxley.dave.fun.sport.stepcounter.mycode.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import oxley.dave.fun.sport.stepcounter.api.Period;
import oxley.dave.fun.sport.stepcounter.api.Status;
import oxley.dave.fun.sport.stepcounter.impl.CycleImpl;

public class RewardCalculator implements ICalculator {
	private List<CycleImpl> cycles;
	private boolean wasSuccessful;

	public RewardCalculator(List<CycleImpl> cycles, boolean wasSuccessful) {
		super();
		this.cycles = cycles;
		this.wasSuccessful = wasSuccessful;
	}

	@Override
	public Status calculate(Period p) {
		// TODO Auto-generated method stub
		return new Status() {
			
			@Override
			public void eSetDeliver(boolean deliver) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void eNotify(Notification notification) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean eDeliver() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public EList<Adapter> eAdapters() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void eUnset(EStructuralFeature feature) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void eSet(EStructuralFeature feature, Object newValue) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Resource eResource() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean eIsSet(EStructuralFeature feature) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean eIsProxy() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object eGet(EStructuralFeature feature, boolean resolve) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object eGet(EStructuralFeature feature) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EList<EObject> eCrossReferences() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EList<EObject> eContents() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EReference eContainmentFeature() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EStructuralFeature eContainingFeature() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EObject eContainer() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public EClass eClass() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public TreeIterator<EObject> eAllContents() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
