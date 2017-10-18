package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	private static AthleticGame game;
	
	@BeforeClass
	public static void init(){
		game = new AthleticGame("test");
	}
	
	@Test
	public void addArrivalTest() {
		
		game.addArrival("mario", Instant.now().plusMillis(1000));
		
		Assert.assertEquals(game.getArrivals().size(), 1);
		
	}

	@Test(expected=IllegalArgumentException.class)
	public void getParecipiantTimeTest(){
		
		game.getParecipiantTime("marioo");

	}
	
}
