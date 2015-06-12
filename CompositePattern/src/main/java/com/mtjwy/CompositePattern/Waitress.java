package com.mtjwy.CompositePattern;

import java.util.Iterator;

public class Waitress {
	MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n----");
		
		while (iterator.hasNext()) {
			MenuComponent menuComponent = 
					(MenuComponent) iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
				//e.printStackTrace();
				/*
				 * head first design pattern p375 , talk about why ignore exception,
				 * 
				 * for transparency
				 */
			}
		}
	}
}

