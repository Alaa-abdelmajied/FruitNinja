package model.level;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import model.Element.Element;
import model.Element.Heart;
import model.bomb.BombFactory;
import model.fruit.FruitFactory;

public class Easy implements LevelStrategy {


	@Override
	public ArrayList<Element> elementThrow() {

		ArrayList<Element> elements = new ArrayList<Element>();
		FruitFactory fruitFactory = new FruitFactory();
		BombFactory bombFactory = new BombFactory();
		Heart heart = new Heart();

		elements.add(fruitFactory.getFruit("Apple"));
		elements.add(fruitFactory.getFruit("Strawberry"));
		elements.add(fruitFactory.getFruit("SpecialApple"));
		elements.add(fruitFactory.getFruit("Orange"));
		elements.add(bombFactory.getBomb("Dangerous"));
		elements.add(fruitFactory.getFruit("Pear"));
		elements.add(fruitFactory.getFruit("SpecialGrape"));
		elements.add(fruitFactory.getFruit("Strawberry"));
		elements.add(bombFactory.getBomb("Fatal"));
		elements.add(fruitFactory.getFruit("Pineapple"));
		elements.add(fruitFactory.getFruit("Orange"));
		elements.add(fruitFactory.getFruit("SpecialApple"));
		elements.add(fruitFactory.getFruit("Apple"));
		elements.add(fruitFactory.getFruit("Strawberry"));
		elements.add(fruitFactory.getFruit("Pear"));
		elements.add(fruitFactory.getFruit("SpecialApple"));
		elements.add(fruitFactory.getFruit("Orange"));
		elements.add(fruitFactory.getFruit("Strawberry"));
		elements.add(bombFactory.getBomb("Dangerous"));
		elements.add(fruitFactory.getFruit("SpecialGrape"));
		elements.add(bombFactory.getBomb("Fatal"));
		elements.add(heart);

		return elements;

	}

}
