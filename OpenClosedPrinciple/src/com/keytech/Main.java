package com.keytech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	/*
	 * OCP + specification
	 * Should be open for extension but closed for modification
	 * */
	public static void main(String[] args) {

		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
		Product bic = new Product("Bic", Color.BLUE, Size.SMALL);
		Product fridge = new Product("Samsung", Color.RED, Size.HUGE);
		Product tree = new Product("ChristmasTree", Color.GREEN, Size.LARGE);
		
		List<Product> products = new ArrayList<Product>(Arrays.asList(apple, bic, fridge, tree));
		
		ProductFilter pFilter = new ProductFilter();
		System.out.println("Green products (old):");
		pFilter.filterByColor(products, Color.GREEN).
		forEach(p -> System.out.println("-"+p.name+" is green"));
		
	}

}
