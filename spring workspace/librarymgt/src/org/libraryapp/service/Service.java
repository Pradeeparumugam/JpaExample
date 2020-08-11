package org.libraryapp.service;

import org.libraryapp.entities.*;

public interface Service {

		 void addBook(String id);
		 Book displaybook(String id);
		void remove(String id);
		void updateCost(String id,double newCost);
	}
	
