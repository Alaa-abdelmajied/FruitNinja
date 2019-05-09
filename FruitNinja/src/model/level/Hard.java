package model.level;

import java.util.LinkedList;
import java.util.Queue;

import model.Element;

public class Hard implements LevelStrategy{

	@Override
	public double maxHeight() {
		return 3;
	}

	@Override
	public double getInitialVelocity() {
		return 10;
	}

	@Override
	public double getFallingVelocity() {
		return 10;
	}

	@Override
	public Element gameQueue() {
	
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
		
		return (Element) queue;
		
	}

}
