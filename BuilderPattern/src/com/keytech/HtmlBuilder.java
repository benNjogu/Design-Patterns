package com.keytech;

public class HtmlBuilder {

	private String rootName;
	private HTML_Element root = new HTML_Element();

	public HtmlBuilder(String rootName) {
		this.rootName = rootName;
		root.name = rootName;
	}

	public HtmlBuilder addChild(String childName, String childText) {
		HTML_Element e = new HTML_Element(childName, childText);
		root.elements.add(e);
		return this;
	}
	
	public void clear() {
		root = new HTML_Element();
		root.name = rootName;
	}

	@Override
	public String toString() {
		return root.toString();
	}
	
	
}
