package model.level;

import java.util.LinkedList;
import java.util.Queue;

import model.Element;
import model.fruit.FruitFactory;

public class Arcade implements LevelStrategy{

	@Override
	public Queue<Element> gameQueue() {
		Queue<Element> queue = new LinkedList<Element>();
		FruitFactory fruitFactory = new FruitFactory();

		queue.add(fruitFactory.getFruit("Apple"));
		queue.add(fruitFactory.getFruit("Strawberry"));
		queue.add(fruitFactory.getFruit("SpecialApple"));
		queue.add(fruitFactory.getFruit("Orange"));
		queue.add(fruitFactory.getFruit("Pear"));
		queue.add(fruitFactory.getFruit("SpecialGrape"));
		queue.add(fruitFactory.getFruit("Strawberry"));
		queue.add(fruitFactory.getFruit("Orange"));
		queue.add(fruitFactory.getFruit("SpecialApple"));
		queue.add(fruitFactory.getFruit("Apple"));
		queue.add(fruitFactory.getFruit("Strawberry"));
		queue.add(fruitFactory.getFruit("Pear"));
		queue.add(fruitFactory.getFruit("SpecialApple"));
		queue.add(fruitFactory.getFruit("Orange"));
		queue.add(fruitFactory.getFruit("Strawberry"));
		queue.add(fruitFactory.getFruit("SpecialGrape"));
		queue.add(fruitFactory.getFruit("Pear"));
		queue.add(fruitFactory.getFruit("Orange"));
		queue.add(fruitFactory.getFruit("SpecialApple"));
		queue.add(fruitFactory.getFruit("Apple"));
		queue.add(fruitFactory.getFruit("Strawberry"));
		
		return null;
	}
	
	

}
