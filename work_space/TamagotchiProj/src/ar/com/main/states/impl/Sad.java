package ar.com.main.states.impl;

import ar.com.main.entities.IPet;
import ar.com.main.states.State;

public class Sad extends State {
	public static final String SAD_EAT_MSSG = "two beep...I must vomit";
	public static final String SAD_DRINK_MSSG = "three beeps...the display should flicker";
	
	@Override
	public String handleEat(IPet pet) {
		System.out.println(SAD_EAT_MSSG);
		return SAD_EAT_MSSG;
		
	}

	@Override
	public String handleDrink(IPet pet) {
		System.out.println(SAD_DRINK_MSSG);
		return SAD_DRINK_MSSG;		
	}

	@Override
	public String handleHug(IPet pet) {
		pet.setState(new Happy());
		return CHANGE_STATE_MSSG;		
	}
}
