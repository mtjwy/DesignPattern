package com.mtjwy.AdapterPattern;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<T> implements Iterator<T> {
	Enumeration<T> enumeration;
	
	public EnumerationIterator(Enumeration<T> enumeration) {
		this.enumeration = enumeration;
	}
	public boolean hasNext() {
		
		return enumeration.hasMoreElements();
	}

	public T next() {
		
		return enumeration.nextElement();
	}

	public void remove() {
		throw new UnsupportedOperationException();	
	}
	
}
