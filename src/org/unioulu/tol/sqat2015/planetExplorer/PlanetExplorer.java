package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 152
// Finish time:
public class PlanetExplorer {
	
	int posX = 0;
	int posY = 0;
	String facing = "North";
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		if(command.isEmpty()) { 
			return "(0, 0), North";
		}
		
		for(int i = 0; i < command.length(); i++){
			
			//Forward actions
			if (command.charAt(i) == 'f' && getFacing().equals("North")){
				posY++;
			}
			else if (command.charAt(i) == 'f' && getFacing().equals("East")){
				posX++;
			}
			else if (command.charAt(i) == 'f' && getFacing().equals("South")){
				posY--;
			}
			else if (command.charAt(i) == 'f' && getFacing().equals("West")){
				posX--;
			}
			//Backward actions			
			if (command.charAt(i) == 'b' && getFacing().equals("North")){
				posY--;
			}
			
			//Right turns
			else if(command.charAt(i) == 'r' && getFacing().equals("North")){
				facing = "East";
			}
			else if(command.charAt(i) == 'r' && getFacing().equals("East")){
				facing = "South";
			}
			else if(command.charAt(i) == 'r' && getFacing().equals("South")){
				facing = "West";
			}
			else if(command.charAt(i) == 'r' && getFacing().equals("West")){
				facing = "North";
			}
			//Left turns
			else if(command.charAt(i) == 'l' && getFacing().equals("North")){
				facing = "West";
			}
			else if(command.charAt(i) == 'l' && getFacing().equals("West")){
				facing = "South";
			}
			else if(command.charAt(i) == 'l' && getFacing().equals("South")){
				facing = "East";
			}
			else if(command.charAt(i) == 'l' && getFacing().equals("East")){
				facing = "North";
			}
		}
		
		return "(" + posX + ", " + posY + "), " + facing;
	}

	public String getLocation() {
		
		return "(" + posX + ", " + posY + "), " + facing;
	}
	
	public String getFacing(){
		return facing;
	}
	
	
}
