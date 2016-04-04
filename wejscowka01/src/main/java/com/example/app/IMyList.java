package com.example.app;

import java.util.List;

public interface IMyList {
	
	boolean addBag(Bag bag);
	boolean removeBag(Bag bag);
	public List<Bag> getAll();
	Bag findBagByValueInt(int value_int);
	Bag findBagByValueDouble(double value_double);
	Bag findBagByBool(boolean value_float);
	
}
