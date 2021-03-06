package com.keytech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HTML_Element {

	public String name, text;
	public List<HTML_Element> elements = new ArrayList<HTML_Element>();
	private final int indentSize = 2;
	private final String newLine = System.lineSeparator();

	public HTML_Element() {

	}

	public HTML_Element(String name, String text) {
		super();
		this.name = name;
		this.text = text;
	}

	private String toStringImpl(int indent) {
		StringBuilder sb = new StringBuilder();
		String i = String.join("", Collections.nCopies(indent * indentSize, " "));
		sb.append(String.format("%s<%s>%s", i, name, newLine));
		if (text != null && !text.isEmpty()) {
			sb.append(String.join("", Collections.nCopies(indentSize * (indent + 1), " "))).append(text)
					.append(newLine);
		}

		for (HTML_Element e : elements)
			sb.append(e.toStringImpl(indent + 1));
		
		sb.append(String.format("%s</%s>%s", i, name, newLine));
		return sb.toString();

	}

	@Override
	public String toString() {
		return toStringImpl(0);
	}

}
