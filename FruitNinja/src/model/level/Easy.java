package model.level;

import java.util.LinkedList;
import java.util.Queue;

import model.Element;
import model.bomb.BombFactory;
import model.bomb.Dangerous;
import model.fruit.FruitFactory;
import model.fruit.Orange;
import model.fruit.Pear;
import model.fruit.SpecialApple;
import model.fruit.SpecialGrape;
import model.fruit.Strawberry;

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
		FruitFactory fruitFactory = new FruitFactory();
		BombFactory bombFactory = new BombFactory();
		
		queue.add(fruitFactory.getFruit("Apple"));
		queue.add(fruitFactory.getFruit("Strawberry"));
		queue.add(fruitFactory.getFruit("SpecialApple"));
		queue.add(bombFactory.getBomb("Fatal"));
		queue.add(fruitFactory.getFruit("Orange"));
		queue.add(bombFactory.getBomb("Dangerous"));
		queue.add(fruitFactory.getFruit("Pear"));
		queue.add(fruitFactory.getFruit("SpecialGrape"));
		queue.add(fruitFactory.getFruit("Strawberry"));
		queue.add(bombFactory.getBomb("Fatal"));
		
		return queue;

	}

}
