package game;

import java.util.ArrayList;

import processing.core.PApplet;

public class StarField {
	ArrayList<StarLine> stars = new ArrayList<StarLine>();
	PApplet sketch;
	StarField(PApplet sketch){
		this.sketch = sketch;
		for(int i = 0;i<sketch.height;i++) {
			addStars(i);
		}
	}
	void move() {
		for(StarLine o : stars) {
			o.move();
		}
		//remove rows of stars that are offscreen, enforces java 8 dependency
		stars.removeIf(e -> (e.getY() < 0));
		//regenerate stars
		while(stars.size() < sketch.height) {
			addStars((stars.size()+1));
		}
		//debug: check arraylist size
		//System.out.println(stars.size());
	}
	void addStars(int Y) {
		stars.add(new StarLine(sketch, 0, Y));
	}
}
