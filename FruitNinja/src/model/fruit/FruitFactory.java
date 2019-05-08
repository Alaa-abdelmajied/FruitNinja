package model.fruit;

public class FruitFactory {

	public Fruit getFruit(String fruitName) {

		if (fruitName == null)
			return null;
		if (fruitName.equals("Apple"))
			return new Apple();
		if (fruitName.equals("Grape"))
			return new Grape();
		if (fruitName.equals("Orange"))
			return new Orange();
		if (fruitName.equals("WaterMelon"))
			return new WaterMelon();
		if (fruitName.equals("Strawberry"))
			return new Strawberry();

		return null;

	}

}