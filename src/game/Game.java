//TODO
//some lore
//splashscreen, maybe option to read lore again, play game, quit, options menu popup?
//procedural space background
//firing mechanics
//enemies
//powerups
//hud
//maybe spice things up with a demo reel
//bee level
//at least one other level
//level up
//animate ship movement

//SYSTEM REQUIREMENTS
//java 8 (see StarField)
//250000KiB ram
package game;

import processing.core.PApplet;

public class Game extends PApplet {

	//declare all the objects
	Ship player;
	StarField galaxy;
	
	public void settings() {
		size(350, 700,P2D);
	}

	public void setup() {
		//use preferred drawing mode
		imageMode(CENTER);
		//set up sprites
		Sprites.set(this);
	    //create the player, there will only ever be one but this keeps things nice and neat and opens up
	    //future possibilities
		player = new Ship(this,Sprites.getSpaceShip(),10,width/2,height/2,180);
		//this is the entire galaxy, it's kinda a big deal
		galaxy = new StarField(this);
	}

	public void draw() {
		background(0);
		//move to a for loop design in the future?
		galaxy.move();
		player.move();
	}
	
	public void keyPressed() {
		  if (keyCode == UP) {
			  player.speedShift(1);
		  }
		  if (keyCode == DOWN) {
			  player.speedShift(-1);
		  }
		  if (keyCode == LEFT) {
			  player.setRotation(-4);
		  }
		  if (keyCode == RIGHT) {
			  player.setRotation(4);
		  }
	}
	
	public static void main(String _args[]) {
		PApplet.main(new String[] { game.Game.class.getName() });
	}
}
