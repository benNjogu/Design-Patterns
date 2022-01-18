package com.keytech;

public class OldFushionedPrinter implements Machine{

	@Override
	public void print(Document document) {
		
	}

	@Override
	public void fax(Document document) throws Exception {
		throw new Exception();
	}

	@Override
	public void scan(Document document) {
		// TODO Auto-generated method stub
		
	}

}
