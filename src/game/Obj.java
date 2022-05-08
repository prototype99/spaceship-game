//this is the basis of the entire universe. everything is somewhere, and at that, usually going somewhere.
//it is named obj so it doesn't clash with other stuff

package game;

import processing.core.PApplet;
import processing.core.PVector;

public class Obj {
	PApplet sketch;
	PVector position,velocity;
	int speed;

	Obj(PApplet sketch,int X, int Y, int speed) {
		this.sketch = sketch;
		this.speed = speed;
		position = new PVector(X, Y);
		velocity = new PVector(0, speed);
	}
	
	void move(){
		//calculate the new position for next frame, made by adding velocity to position to create a whole new vector
	    position.add(velocity);
	  }
	
}
