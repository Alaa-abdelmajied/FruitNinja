package model.level;

import java.util.LinkedList;
import java.util.Queue;

import model.Element;
import model.bomb.Dangerous;
import model.fruit.Orange;
import model.fruit.SpecialApple;
import model.fruit.SpecialGrape;
import model.fruit.Strawberry;
import model.fruit.WaterMelon;

public class Easy implements LevelStrategy {

	@Override
	public double maxHeight() {
		return 5;
	}

	@Override
	public double getInitialVelocity() {
		return 3;
	}

	@Override
	public double getFallingVelocity() {
		return 3;
	}

	@Override
	public Queue<Element> gameQueue() {

		Queue<Element> queue = new LinkedList<Element>();

		queue.add(new SpecialApple());
		queue.add(new Strawberry());
		queue.add(fatal);
		queue.add(new Orange());
		queue.add(new Dangerous());
		queue.add(new WaterMelon());
		queue.add(new SpecialGrape());
		queue.add(new Strawberry());
		queue.add(fatal);

		return queue;

	}

}
