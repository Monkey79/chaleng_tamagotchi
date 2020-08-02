package ar.com.main.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import ar.com.main.entities.IPet;
import ar.com.main.entities.impl.Tamagotchi;
import ar.com.main.states.impl.Happy;
import ar.com.main.states.impl.Hungry;
import ar.com.main.states.impl.Sad;
import ar.com.main.states.impl.Thirsty;

public class TamagotchiHugTest {
	
	@Test
	public void getHugSadPetTest() {
		IPet tamag = new Tamagotchi();
		tamag.setState(new Sad());
		tamag.hug();
		assertThat(tamag.getState(), instanceOf(Happy.class));
	}
	@Test
	public void getHugHappyPetTest() {
		IPet tamag = new Tamagotchi();
		tamag.setState(new Happy());
		assertNull(tamag.hug());
	}
	@Test
	public void getHugHungryPetTest() {
		IPet tamag = new Tamagotchi();
		tamag.setState(new Hungry());
		assertNull(tamag.hug());
	}
	@Test
	public void getHugThirstyPetTest() {
		IPet tamag = new Tamagotchi();
		tamag.setState(new Thirsty());
		assertNull(tamag.hug());
	}

}
