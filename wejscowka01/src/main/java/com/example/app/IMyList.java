package com.example.app;

import java.util.List;

public interface IMyList {
	
	boolean addBag(Bag bag);
	boolean removeBag(Bag bag);
	public List<Bag> getAll();
	Bag findBagBySzerokosc(int value_int);
	Bag findBagByWaga(double value_double);
	Bag findBagByLotniczy(boolean value_float);
	
}
