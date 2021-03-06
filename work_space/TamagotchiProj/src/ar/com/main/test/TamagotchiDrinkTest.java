package ar.com.main.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import ar.com.main.entities.IPet;
import ar.com.main.entities.impl.Tamagotchi;
import ar.com.main.states.impl.Happy;
import ar.com.main.states.impl.Hungry;
import ar.com.main.states.impl.Sad;
import ar.com.main.states.impl.Thirsty;

public class TamagotchiDrinkTest {
	
	@Test
	public void getDrinkThirstyPet() {
		IPet tamag = new Tamagotchi();
		tamag.setState(new Thirsty());
		tamag.drink();
		assertThat(tamag.getState(), instanceOf(Happy.class));
	}
	@Test
	public void getDrinkHappyPet() {
		IPet tamag = new Tamagotchi();
		tamag.setState(new Happy());
		assertEquals(Happy.DRINK_HAPPY_MSSG,tamag.drink());
	}
	@Test
	public void getDrinkSadPet() {
		IPet tamag = new Tamagotchi();
		tamag.setState(new Sad());
		assertEquals(Sad.SAD_DRINK_MSSG, tamag.drink());
	}
	@Test
	public void getDrinkHungryPet() {
		IPet tamag = new Tamagotchi();
		tamag.setState(new Hungry());
		assertNull(tamag.drink());
	}

}
