package com.keytech;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sun.reflect.Reflection;
import sun.reflect.ReflectionFactory;

interface HotDrink {

	void consume();

}

class Tea implements HotDrink {

	@Override
	public void consume() {
		System.out.println("This tea is delicious");
	}

}

class Coffee implements HotDrink {

	@Override
	public void consume() {
		System.out.println("This coffee is delicious");
	}

}

interface HotDrinkFactory {

	HotDrink prepare(int amount);

}

class TeaFactory implements HotDrinkFactory {

	@Override
	public HotDrink prepare(int amount) {
		System.out.println("Put in tea bug, boil water, pour " + amount + "ml, add lemon and enjoy!");
		return new Tea();
	}

}

class CoffeeFactory implements HotDrinkFactory {

	@Override
	public HotDrink prepare(int amount) {
		System.out.println("Grind some beans, boil water, pour " + amount + "ml, add cream and sugar, enjoy");
		return new Coffee();
	}

}

class HotDrinkMachine {

	private List<Map<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

	

}

public class AbstractFactory {

	public static void main(String[] args) {

	}

}
