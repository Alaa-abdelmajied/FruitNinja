package model.level;

import java.util.LinkedList;
import java.util.Queue;

import model.Element;
import model.bomb.Dangerous;
import model.fruit.Orange;
import model.fruit.Pear;
import model.fruit.SpecialApple;
import model.fruit.SpecialGrape;
import model.fruit.Strawberry;

public class Medium implements LevelStrategy {

	@Override
	public double maxHeight() {
		return 4;
	}

	@Override
	public double getInitialVelocity() {
		return 7;
	}

	@Override
	public double getFallingVelocity() {
		return 7;
	}

	@Override
	public Queue<Element> gameQueue() {

		Queue<Element> queue = new LinkedList<Element>();

		queue.add(new SpecialApple());
		queue.add(new Strawberry());
		queue.add(fatal);
		queue.add(new Orange());
		queue.add(new Dangerous());
		queue.add(new Pear());
		queue.add(new SpecialGrape());
		queue.add(new Strawberry());
		queue.add(fatal);

		return queue;
	}

}
