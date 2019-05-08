package model.level;

import java.util.LinkedList;
import java.util.Queue;
import model.bomb.Bombs;
import model.bomb.Dangerous;
import model.bomb.Fatal;
import model.fruit.Fruit;
import model.fruit.Orange;
import model.fruit.SpecialApple;
import model.fruit.SpecialGrape;
import model.fruit.Strawberry;
import model.fruit.WaterMelon;

public class Easy implements LevelStrategy{


	Fruit orange = new Orange();
	Fruit apple = new SpecialApple();
	Fruit strawberry = new Strawberry();
	Fruit grape = new SpecialGrape();
	Fruit watermelon = new WaterMelon();
	
	Bombs fatal = new Fatal();
	Bombs dangerous = new Dangerous();
	
	
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
	public Fruit gameQueue() {
		
		Queue<Fruit> queue = new LinkedList<Fruit>();
		
		queue.add(apple);
		queue.add(strawberry);
		

		return (Fruit) queue;

}
}
