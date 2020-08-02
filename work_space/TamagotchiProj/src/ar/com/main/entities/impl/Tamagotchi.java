package ar.com.main.entities.impl;

import ar.com.main.entities.IPet;
import ar.com.main.states.State;

public class Tamagotchi implements IPet {
	private State state;
	

	@Override
	public void setState(State state) {
		this.state = state;

	}

	@Override
	public String eat() {
		return state.handleEat(this);
	}

	@Override
	public String drink() {
		return state.handleDrink(this);
	}

	@Override
	public String hug() {
		return state.handleHug(this);
	}

	@Override
	public State getState() {
		return state;
	}

}
