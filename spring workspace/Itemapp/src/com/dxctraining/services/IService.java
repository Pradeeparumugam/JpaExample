package com.dxctraining.services;

public interface IService {
	    public Item findItem(int id);
	    Item update(Item item);
	    void removeItem(int id);
	}