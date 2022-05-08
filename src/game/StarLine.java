package game;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PConstants;

//starline extends object because it needs a referencable position. 
public class StarLine extends Obj {
	ArrayList<BaseObject> stars = new ArrayList<BaseObject>();
	
	StarLine(PApplet parent, int X, int Y) {
		super(parent,X,Y,-1);
		//could I have stored each starline in a createshape(group)?... yes, yes i could have done. I elected not to
		//because it feels more extensible
		stars = new ArrayList<BaseObject>();
		generateStars(Y);
	}

	void generateStars(int Y) {
		//randomise whether the star is even drawn to spice things up
		float z=sketch.random(2);
		for(int i = 0;i<sketch.width;i++) {
			if(z<1) {
				//randomise the size
				int size = (int)sketch.random(3);
				stars.add(new BaseObject(sketch, sketch.createShape(PConstants.ELLIPSE, i, 0, size, size), (int)sketch.random(3), i, Y, -10));
		    }
		}
	}
	void move() {
		//move the position reference
		super.move();
		for(BaseObject o : stars) {
			o.move();
		}
	}
	int getY() {
		return (int)position.y;
	}
}
