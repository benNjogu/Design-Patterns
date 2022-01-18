package com.keytech;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

	// filtering by color
	public Stream<Product> filterByColor(List<Product> products, Color color) {

		return products.stream().filter(p -> p.color == color);

	}

	// filtering by size
	public Stream<Product> filterBySize(List<Product> products, Size size) {

		return products.stream().filter(p -> p.size == size);

	}

	// filtering by size and color
	public Stream<Product> filterBySizeAndColor(List<Product> products, Size size,Color color) {

		return products.stream().filter(p -> p.size == size && p.color == color);

	}

}
