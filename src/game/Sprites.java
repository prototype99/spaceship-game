package game;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PShape;

public class Sprites {
	static PApplet sketch;
	static PShape [] sprites = new PShape[1];
	static void set(PApplet sketch) {
		Sprites.sketch = sketch;
		setSpaceShip();
	}
	static void setSpaceShip() {
		//define spaceship's shape
				PShape sprite = sketch.createShape();
			    sprite.beginShape();
			      sprite.vertex(0, -3);
			      sprite.vertex(2, 2);
			      sprite.vertex(1, 3);
			      sprite.vertex(0, 2);
			      sprite.vertex(-1, 3);
			      sprite.vertex(-2, 2);
			    sprite.endShape(PConstants.CLOSE);
			    sprites[0]=sprite;
	}
	static PShape getSpaceShip() {
		return sprites[0];
	}
}
