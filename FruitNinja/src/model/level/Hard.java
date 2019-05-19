package model.level;

import java.util.ArrayList;

import model.Element.Element;
import model.bomb.BombFactory;
import model.fruit.FruitFactory;

public class Hard implements LevelStrategy {

	@Override
	public ArrayList<Element> elementThrow(){

		ArrayList<Element> elements = new ArrayList<Element>();
		FruitFactory fruitFactory = new FruitFactory();
		BombFactory bombFactory = new BombFactory();
		
		elements.add(fruitFactory.getFruit("Apple"));
		elements.add(fruitFactory.getFruit("Orange"));
		elements.add(bombFactory.getBomb("Dangerous"));
		elements.add(fruitFactory.getFruit("Banana"));
		elements.add(fruitFactory.getFruit("Pear"));
		elements.add(bombFactory.getBomb("Fatal"));
		elements.add(fruitFactory.getFruit("Banana"));
		elements.add(bombFactory.getBomb("Dangerous"));
		elements.add(fruitFactory.getFruit("Orange"));
		elements.add(bombFactory.getBomb("Dangerous"));
		elements.add(fruitFactory.getFruit("Pineapple"));
		elements.add(fruitFactory.getFruit("Strawberry"));
		elements.add(bombFactory.getBomb("Dangerous"));
		elements.add(fruitFactory.getFruit("SpecialGrape"));
		elements.add(bombFactory.getBomb("Dangerous"));
		elements.add(bombFactory.getBomb("Fatal"));
		elements.add(fruitFactory.getFruit("Orange"));
		elements.add(fruitFactory.getFruit("SpecialApple"));
		elements.add(fruitFactory.getFruit("Orange"));
		elements.add(fruitFactory.getFruit("Apple"));
		elements.add(bombFactory.getBomb("Fatal"));
		elements.add(fruitFactory.getFruit("Orange"));
		
		return elements;

	}

}
