package model.level;

import java.util.LinkedList;
import java.util.Queue;

import model.Element;

public class Easy implements LevelStrategy{

	
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
