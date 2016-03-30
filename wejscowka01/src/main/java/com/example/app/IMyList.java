package com.example.app;

import java.util.List;

public interface IMyList {
	
	boolean addBag(Bag bag);
	boolean removeBag(Bag bag);
	public List<Bag> getAll();
	Bag FindBag_ByValue_int(int value_int);
	Bag FindBag_ByValue_double(double Value_double);
	Bag FindBag_ByValue_float(float Value_float);
	
}
