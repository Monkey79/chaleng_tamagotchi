package ar.com.main.entities;

import ar.com.main.states.State;

public interface IPet {	
	public void setState(State state);
	public State getState();
	
	public String eat();
	public String drink();
	public String hug();
}
