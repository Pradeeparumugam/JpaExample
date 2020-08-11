package org.libraryapp.dao;
import java.util.*;
import org.libraryapp.entities.*;
public interface Operator {
	//public static void main(String args[]) {
		void addBook(String id);
		Book displaybook(String id);
		void  remove(String id);
		 void updateCost(String id,double newCost);
	}


