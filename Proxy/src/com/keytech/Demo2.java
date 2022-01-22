package com.keytech;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

interface Human{
	
	void walk();
	void talk();
}

class LoggingHandler implements InvocationHandler{

	private final Object target;
	private Map<String, Integer> calls = new HashMap<String, Integer>();
 	
	public LoggingHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] arg2) throws Throwable {
		
		String name = method.getName();
		
		if (name.contains("toString")) {
			return calls.toString();
		}
		
		calls.merge(name, 1, Integer::sum);
		return method.invoke(target, arg2);
	}
	
	
}

class Person implements Human{

	@Override
	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void talk() {
		System.out.println("I am talking");
	}
	
	
}

public class Demo2 {

	/*
	 * Dynamic proxy:- created at runtime rather than compile time
	 * */
	public static void main(String[] args) {
		
		Person person = new Person();
		Human logged = withLogging(person, Human.class);
		logged.walk();
		logged.talk();
		logged.talk();
		System.out.println(logged);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T withLogging(T target, Class<T> itf) {
		
		return (T) Proxy.newProxyInstance(
				itf.getClassLoader(),
				new Class<?>[] {itf},
				new LoggingHandler(target)
				);
	}
	
}
