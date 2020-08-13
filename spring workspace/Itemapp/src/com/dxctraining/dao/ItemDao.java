package com.dxctraining.dao;

public interface ItemDao {

	public Item findItem(int id);
	Item update(Item item);
	void removeItem(int id);
}


