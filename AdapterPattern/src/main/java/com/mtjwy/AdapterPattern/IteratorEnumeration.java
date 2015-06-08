package com.mtjwy.AdapterPattern;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration<T> implements Enumeration<T> {
	Iterator<T> iterator;
	
	public IteratorEnumeration(Iterator<T> iterator) {
		this.iterator = iterator;
	}
	public boolean hasMoreElements() {
		
		return iterator.hasNext();
	}

	public T nextElement() {
		
		return iterator.next();
	}

}
