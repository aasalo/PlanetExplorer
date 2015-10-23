package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testExplorerDoesntMove() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0)");
		
		explorer.executeCommand("");
		
		assertEquals("(0, 0), North", explorer.executeCommand(""));
	}
	
	@Test
	public void testExplorerMovesForwardOnce() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0)");
		
		explorer.executeCommand("f");
		
		assertEquals("(0, 1), North", explorer.getLocation());
	}
	
	@Test
	public void testExplorerMovesForwardTwice() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0)");
		
		explorer.executeCommand("ff");
		
		assertEquals("(0, 2), North", explorer.getLocation());
	}
	
	@Test
	public void testExplorerMovesForwardOnceAndTurnsRight() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0)");
		
		explorer.executeCommand("fr");
		
		assertEquals("(0, 1), East", explorer.getLocation());
	}
	
	@Test
	public void testExplorerMovesForwardOnceAndTurnsLeft() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0)");
		
		explorer.executeCommand("fl");
		
		assertEquals("(0, 1), West", explorer.getLocation());
	}
	
	@Test
	public void testExplorerMovesForwardOnceAndTurnsRightMovesForward() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0)");
		
		explorer.executeCommand("frf");
		
		assertEquals("(1, 1), East", explorer.getLocation());
	}
	
	@Test
	public void testExplorerMovesForwardTurnsRightMovesForwardTurnsLeft() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0)");
		
		explorer.executeCommand("frfl");
		
		assertEquals("(1, 1), North", explorer.getLocation());
	}
	
	@Test
	public void testExplorerTurnsRightTwice() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0)");
		
		explorer.executeCommand("rr");
		
		assertEquals("(0, 0), South", explorer.getLocation());
	}
	
	@Test
	public void testExplorerTurnsRight4times() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0)");
		
		explorer.executeCommand("rrrr");
		
		assertEquals("(0, 0), North", explorer.getLocation());
	}
	
	@Test
	public void testExplorerTurnsLeft4times() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0)");
		
		explorer.executeCommand("llll");
		
		assertEquals("(0, 0), North", explorer.getLocation());
	}
	
	@Test
	public void testExplorerGoesAroundTurningRight() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0)");
		
		explorer.executeCommand("frfrfrfr");
		
		assertEquals("(0, 0), North", explorer.getLocation());
	}
}
