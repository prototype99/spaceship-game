package game;

import processing.core.PApplet;
import processing.core.PShape;

public class Ship extends BaseObject {
	int rotation;
	Ship(PApplet parent, PShape spaceship,int size, int X, int Y, int dir){
		super(parent,spaceship,size,X,Y,0);
		this.rotation = dir;
		sprite.rotate(PApplet.radians(dir));
	}
	  void setRotation(int shift) {
		  rotation = rotation+shift;
		  if(rotation < 0) {
			  rotation=360 + rotation;
		  } else if (rotation > 360) {
			  rotation = rotation - 360;
		  }
		  sprite.rotate(PApplet.radians(shift));
		  velocity.rotate(PApplet.radians(shift));
	  }
	  void speedShift(int shift) {
		  if(speed+shift < 0) {
			  speed=0;
		  } else {
			  speed=speed+shift;
		  }
		  velocity.set(0, (speed*-1));
		  velocity.rotate(PApplet.radians(rotation));
	  }
}
