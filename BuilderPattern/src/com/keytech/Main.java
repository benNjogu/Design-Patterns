package com.keytech;

public class Main {

	/*
	 * Builder :- When pieceWice object construction is complicated, 
	 *  provide an API for doing it succinctly(briefly and to the point)
	 * */
	public static void main(String[] args) {
		
		String hello = "hello";
		
		System.out.println("<p>"+hello+"<p>");
		
		String[] words = {"hello","world"};
		
		StringBuilder sb = new StringBuilder();
		sb.append("<ul>\n");
		for (String word : words) {
			sb.append(String.format("  <li>%s</li>\n", word));
		}
		sb.append("</ul>");
		System.out.println(sb.toString());
		System.out.println("-----------------------------------");
		//Using the html builder
		HtmlBuilder builder = new HtmlBuilder("ul");
		builder.addChild("li", "Hello");
		builder.addChild("li", "World");
		System.out.println(builder);
		
	}
	
}
