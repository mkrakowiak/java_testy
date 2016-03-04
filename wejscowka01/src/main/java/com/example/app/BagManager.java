package com.example.app;
import java.util.ArrayList;
import java.util.List;

public class BagManager{

	 List<Bag> bags = new ArrayList<Bag>();
	
	public void addBag(Bag bag)
	{
		bags.add(bag);
	}
	
	public void removeBag(Bag bag)
	{
		bags.remove(bag);
	}
}
