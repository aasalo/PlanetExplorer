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
		
		assertEquals("(1, 0), North", explorer.getLocation());
	}
	
	@Test
	public void testExplorerMovesForwardTwice() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0)");
		
		explorer.executeCommand("ff");
		
		assertEquals("(2, 0), North", explorer.getLocation());
	}
}
