package oxley.dave.fun.sport.stepcounter.mycode.impl;

import java.util.List;

import oxley.dave.fun.sport.stepcounter.impl.CycleImpl;

public class RewardCalculator {
	private List<CycleImpl> cycles;
	private boolean wasSuccessful;

	public RewardCalculator(List<CycleImpl> cycles, boolean wasSuccessful) {
		super();
		this.cycles = cycles;
		this.wasSuccessful = wasSuccessful;
	}

}
