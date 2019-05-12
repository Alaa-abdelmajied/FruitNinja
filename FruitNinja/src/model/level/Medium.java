package model.level;

import java.util.LinkedList;
import java.util.Queue;

import model.Element;

public class Medium implements LevelStrategy{

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
		
		queue.add(apple);
		queue.add(strawberry);
		queue.add(fatal);
		queue.add(orange);
		queue.add(dangerous);
		queue.add(watermelon);
		queue.add(grape);
		queue.add(strawberry);
		queue.add(fatal);
		
		return queue;
	}

}
