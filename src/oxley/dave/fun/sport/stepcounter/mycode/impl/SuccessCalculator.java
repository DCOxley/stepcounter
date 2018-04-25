package oxley.dave.fun.sport.stepcounter.mycode.impl;

import java.util.List;

import oxley.dave.fun.sport.stepcounter.api.Day;

public class SuccessCalculator {

	private List<Day> days;
	private boolean wasSuccesful;

	public SuccessCalculator(List<Day> days, boolean wasSuccesful) {
		super();
		this.days = days;
		this.wasSuccesful = wasSuccesful;
	}

	private boolean wasPeriodSuccessful() {
		return wasSuccesful;
	}

}
