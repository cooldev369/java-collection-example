package com.java.collection.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Devendra Pandey
 *
 */

public class JavaCollectionExample {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.add("Frederick");
		collection.add("Germantown");
		collection.add("Gaithersberg");
		collection.add("Hagerstown");

		System.out.println(""); // prints a new line
		// prints all elements of a collection using advanced for loop
		for(String element: collection) {
			System.out.print(element.toUpperCase() + " ");
		}

		System.out.println(""); // prints a new line
		// prints all elements of a collection using forEach method
		collection.forEach(e -> System.out.print(e.toUpperCase() + " "));

		System.out.println(""); // prints a new line
		// prints all elements of a collection using an iterator
		Iterator<String> iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase() + " ");
		}

	}

}
