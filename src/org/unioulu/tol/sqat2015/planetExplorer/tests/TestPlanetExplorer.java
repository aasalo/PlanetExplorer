package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testPExplorerMovesForwardOnce() {
		PlanetExplorer explorer = new PlanetExplorer(3,3, "(1,0");
		
		explorer.executeCommand("f");
		
		assertEquals("(0, 1), North", explorer.executeCommand("f"));
	}
}
