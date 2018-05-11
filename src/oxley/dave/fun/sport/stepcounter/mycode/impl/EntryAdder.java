package oxley.dave.fun.sport.stepcounter.mycode.impl;

import java.util.Date;

import oxley.dave.fun.sport.stepcounter.api.Cycle;
import oxley.dave.fun.sport.stepcounter.api.Day;

public class EntryAdder {

	private int steps;
	private Day day;
	private Cycle cycle;
	
	public EntryAdder(Cycle cycle){
		this.cycle = cycle;
	}
	
	public void add(int steps, Date date) {
		System.out.println(steps+" taken on "+date);
	}

	public void add() {
		add(5, new Date());
		
	}
	
}
