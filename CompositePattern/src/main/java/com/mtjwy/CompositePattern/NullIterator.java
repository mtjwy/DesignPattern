package com.mtjwy.CompositePattern;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {
	
	

	public boolean hasNext() {
		return false;
	}

	public MenuComponent next() {
		return null;
	}

	public void remove() {
		throw new UnsupportedOperationException();
		
	}
	
}
