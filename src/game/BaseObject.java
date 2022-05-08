//A base object has a shape. Whereas higher order objects serve merely as containers, a base object has a tangible form,
//it is the basis of everything else. also note the use of an attached movement method.
package game;

import processing.core.PApplet;
import processing.core.PShape;

public class BaseObject extends Obj {
	PShape sprite;

	BaseObject(PApplet sketch,PShape sprite, int size, int X, int Y, int speed) {
		super(sketch, X, Y, speed);
		this.sprite = sprite;
		sprite.scale(size);
	}
	
	void move(){
		//draw the shape
		sketch.shape(sprite, position.x,position.y);
		super.move();
	  }
}
