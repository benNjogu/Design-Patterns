package com.keytech;

public interface Specification<T> {

	boolean isSatisfied(T item);
	
}
