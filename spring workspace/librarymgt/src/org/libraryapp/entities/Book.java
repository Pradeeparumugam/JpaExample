package org.libraryapp.entities;

public class Book extends Info{
	String id;
	String name;
	double cost;
	Author author;
	public Book(String id,String name, double cost,Author author) {
		super(id,name);
		this.cost=cost;
		this.author=author;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}


}
