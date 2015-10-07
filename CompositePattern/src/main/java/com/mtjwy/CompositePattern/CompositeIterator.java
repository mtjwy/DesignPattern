package com.mtjwy.CompositePattern;

import java.util.Iterator;
import java.util.LinkedList;

public class CompositeIterator implements Iterator<MenuComponent> {
	
	LinkedList<Iterator<MenuComponent>> stack = new LinkedList<Iterator<MenuComponent>>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}
	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			if (component instanceof Menu) {
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
		
	}
	
}





















