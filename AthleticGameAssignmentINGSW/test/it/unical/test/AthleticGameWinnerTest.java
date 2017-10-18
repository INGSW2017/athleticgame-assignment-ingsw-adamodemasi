package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnerTest {
	
	private static AthleticGame game;
	
	@BeforeClass
	public static void init(){
		game = new AthleticGame("test");
	}
	
	@After
	public void resetTest(){
		
		game.reset();
	}
	
	@Before
	public void startTest(){
		
		game.start();
	}
	
	@Test
	public void getWinnerTimeTest(){
		game.addArrival("lol", Instant.now());
		Assert.assertTrue(game.getParecipiantTime(game.getWinner()) < 1 );
	}
	
	@Test
	public void getWinnerNameTest(){
		
		Assert.assertNull(game.getWinner());
	}
	
}
