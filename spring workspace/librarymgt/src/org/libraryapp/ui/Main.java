package org.libraryapp.ui;

import java.util.Map;

import java.util.*;
import org.libraryapp.dao.*;

import org.libraryapp.entities.*;

public class Main {
	Map<String, Book> b = new HashMap<>();

	public static void main(String args[]) {
		Main lib = new Main();
		lib.input();

	}

	public void input() {
		Author a1 = new Author("111", "valluvar");
		Author a2 = new Author("222", "kambar");
		Book b1 = new Book("1", "book1", 1348, a1);
		Book b2 = new Book("2", "book2", 99.99, a2);

		FictionBook fb1 = new FictionBook("charname");
		ITbook itb1 = new ITbook("Tamil", 1.0);
		b.put(b1.getId(), b1);
		b.put(b2.getId(), b2);

		displayAll();

	}

	public void displayAll() {
		Set<String> keys = b.keySet();
		for (String key : keys) {
			Book book = b.get(key);
			System.out.println(book.getId() + "" + book.getName() + "" + book.getCost());
		}
	}

}
