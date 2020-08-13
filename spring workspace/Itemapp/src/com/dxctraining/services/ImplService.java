package com.dxctraining.services;
import com.dxctraining.dao.*;
import com.dxctraining.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

	@Transactional
	@Service
	public class ImplService implements IService{

	    @Autowired
	private ItemDao itemDao;

	    @Override
	    public Item findItem(int id) {
	        validateId(id);
	       Item item=itemDao.findItem(id);
	       return  item;
	    }

	    private void validateId(int id) {
	       if(id<0)
	       {
	           System.out.println("ID can't be negative");
	       }
	    }

	    @Override
	    public Item update(Item item) {
	        item=itemDao.update(item);
	        return item;
	    }

	    @Override
	    public void removeItem(int id) {
	    itemDao.removeItem(id);
	    }

	}

