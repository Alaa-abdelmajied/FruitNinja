package model.fruit;

public class FruitFactory {

	public Fruit getFruit(String fruitName) {

		if (fruitName == null)
			return null;
		if (fruitName.equals("SpecialApple"))
			return new SpecialApple();
		if (fruitName.equals("SpecialGrape"))
			return new SpecialGrape();
		if (fruitName.equals("Orange"))
			return new Orange();
		if (fruitName.equals("WaterMelon"))
			return new WaterMelon();
		if (fruitName.equals("Strawberry"))
			return new Strawberry();

		return null;

	}

}