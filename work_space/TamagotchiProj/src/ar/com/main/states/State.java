package ar.com.main.states;

import ar.com.main.entities.IPet;

public abstract class State {	
	public static final String CHANGE_STATE_MSSG = "Estado cambiado con exito\n";
	
	public abstract String handleEat(IPet pet);
	public abstract String handleDrink(IPet pet);
	public abstract String handleHug(IPet pet);
}
