package ar.com.main;

import org.junit.runner.JUnitCore;

import ar.com.main.entities.IPet;
import ar.com.main.entities.impl.Tamagotchi;
import ar.com.main.states.impl.Happy;
import ar.com.main.states.impl.Hungry;
import ar.com.main.states.impl.Sad;
import ar.com.main.states.impl.Thirsty;

public class AppMain {

	public static void main(String[] args) {		
		JUnitCore.main("ar.com.main.test.TamagotchiEatTest");
		JUnitCore.main("ar.com.main.test.TamagotchiDrinkTest");
		JUnitCore.main("ar.com.main.test.TamagotchiHugTest");
	}

}
