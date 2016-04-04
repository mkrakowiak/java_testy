package com.example.app;

import java.util.List;

public interface IMyList {
	
	boolean addBag(Bag bag);
	boolean removeBag(Bag bag);
	public List<Bag> getAll();
	Bag findBagByValueint(int value_int);
	Bag findBagByValuedouble(double value_double);
	Bag findBagBybool(boolean value_float);
	
}
