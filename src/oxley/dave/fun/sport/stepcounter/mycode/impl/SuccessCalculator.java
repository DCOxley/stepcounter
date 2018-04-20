package oxley.dave.fun.sport.stepcounter.mycode.impl;

import java.util.List;

import oxley.dave.fun.sport.stepcounter.impl.DayImpl;

public class SuccessCalculator {

	private List<DayImpl> days;
	private boolean wasSuccesful;

	public SuccessCalculator(List<DayImpl> days, boolean wasSuccesful) {
		super();
		this.days = days;
		this.wasSuccesful = wasSuccesful;
	}

	private boolean wasPeriodSuccessful() {
		return wasSuccesful;
	}

}
