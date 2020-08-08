package org.libraryapp.entities;

public class Author extends Info {
	String id;
	String name;
	Author author;

	public Author(String id, String name) {
		super(id, name);
		//this.author = author;
	}

	/*public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	*/
}
