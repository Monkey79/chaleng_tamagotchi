package ar.com.main.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.com.main.entities.IPet;
import ar.com.main.entities.impl.Tamagotchi;
import ar.com.main.states.impl.Happy;
import ar.com.main.states.impl.Hungry;
import ar.com.main.states.impl.Sad;
import ar.com.main.states.impl.Thirsty;

public class TamagotchiEatTest {
	
	@Test
	public void getEatHungryPetTest() {
		IPet tamag = new Tamagotchi();
		tamag.setState(new Hungry());
		tamag.eat();
		assertThat(tamag.getState(), instanceOf(Happy.class));
	}
	@Test 
	public void getEatSadPetTest() {
		IPet tamag = new Tamagotchi();
		tamag.setState(new Sad());		
		assertEquals(Sad.SAD_EAT_MSSG, tamag.eat());		
	}
	@Test
	public void getEatThirstyPetTest() {
		IPet tamag = new Tamagotchi();
		tamag.setState(new Thirsty());
		assertNull(tamag.eat());
	}

}