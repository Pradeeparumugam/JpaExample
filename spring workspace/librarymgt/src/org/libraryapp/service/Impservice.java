package org.libraryapp.service;

import org.libraryapp.dao.Operations;
import java.util.*;
import org.libraryapp.dao.*;
import org.libraryapp.exception.*;
import org.libraryapp.entities.*;

public class Impservice implements Service{

	private Operator service=new Operations(); 
		

		// create
		public void addBook(String id) {
			checkId(id);
			service.addBook(id);
			
		}

		// read
		public Book displaybook(String id) {
			checkId(id);
			checkValid(id);
			service.displaybook(id);
		}

		/*
		 * public displayAll(String id) { Set<String> keys=m.keySet(); for(String
		 * key:keys) { Book book=m.get(keys); return book; } }
		 */

		// delete
		public void remove(String id) {
			checkId(id);
			service.remove(id);
		}

		// updATE
		public void updateCost(String id, double newCost) {
			checkValid(id);
			service.updateCost(id,newCost);
			//book.setCost(cost);

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


