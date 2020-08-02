package ar.com.main.states.impl;

import ar.com.main.entities.IPet;
import ar.com.main.states.State;

public class Happy extends State {
	public static final String DRINK_HAPPY_MSSG = "five beeps...";
	
	@Override
	public String handleEat(IPet pet) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public String handleDrink(IPet pet) {
		System.out.println(DRINK_HAPPY_MSSG);
		return DRINK_HAPPY_MSSG;		
	}

	@Override
	public String handleHug(IPet pet) {
		// TODO Auto-generated method stub
		return null;		
	}
}
