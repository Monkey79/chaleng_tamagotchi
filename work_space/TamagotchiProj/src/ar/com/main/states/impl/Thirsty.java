package ar.com.main.states.impl;

import ar.com.main.entities.IPet;
import ar.com.main.states.State;

public class Thirsty extends State {
	@Override
	public String handleEat(IPet pet) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public String handleDrink(IPet pet) {
		pet.setState(new Happy());
		return CHANGE_STATE_MSSG;
		
	}

	@Override
	public String handleHug(IPet pet) {
		return null;		
	}
}
