package model.level;

import java.util.Queue;

import model.Element;
import model.bomb.Bombs;
import model.bomb.Dangerous;
import model.bomb.Fatal;
import model.fruit.Fruit;
import model.fruit.Orange;
import model.fruit.SpecialApple;
import model.fruit.SpecialGrape;
import model.fruit.Strawberry;
import model.fruit.WaterMelon;

public interface LevelStrategy{
	

	//Fruit orange = new Orange();
	//Fruit apple = new SpecialApple();
	//Fruit strawberry = new Strawberry();
	//Fruit grape = new SpecialGrape();
	//Fruit watermelon = new WaterMelon();
	Bombs fatal = Fatal.getInstance();
	//Bombs dangerous = new Dangerous();
	
	
	
	public double maxHeight();
	
	public double getInitialVelocity();
	
	public double getFallingVelocity();

	public Queue<Element> gameQueue();

}