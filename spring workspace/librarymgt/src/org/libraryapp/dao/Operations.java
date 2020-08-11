package org.libraryapp.dao;

import org.libraryapp.entities.*;
import org.libraryapp.exception.*;
import java.util.*;


public class Operations implements Operator {
	Map<String, Book> m = new HashMap<>();

	// create
	public void addBook(String id) {
		checkId(id);
		Book book = m.get(id);
		m.put(id, book);
	}

	// read
	public Book displaybook(String id) {
		checkId(id);
		checkValid(id);
		Book book = m.get(id);
		return book;
	}

	/*
	 * public displayAll(String id) { Set<String> keys=m.keySet(); for(String
	 * key:keys) { Book book=m.get(keys); return book; } }
	 */

	// delete
	public void remove(String id) {
		checkId(id);
		Book book = m.get(id);
		m.remove(book);
	}

	// updATE
	public void updateCost(String id, double newCost) {
		checkValid(id);
		Book book = m.get(id);
		double price = book.getCost();
		double cost = price + newCost;
		book.setCost(cost);

	}

	public void checkId(String id) {
		if (id == null) {
			throw new NullException("id is null");
		}
	}

	public void checkValid(String str) {
		if (str == " ") {
			throw new NotValidException("not valid");
		}

	}

}
