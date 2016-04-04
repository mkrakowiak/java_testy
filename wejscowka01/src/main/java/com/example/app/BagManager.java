package com.example.app;
import java.util.ArrayList;
import java.util.List;

public class BagManager{

	// List<Bag> bags = new ArrayList<Bag>();
	
	
	
	public IMyList myList;
	public BagManager(IMyList myList){
		this.myList = myList;
	}
	
	public boolean addBag(Bag bag)
	{
		//bags.add(bag);
		return myList.addBag(bag);
	}
	
	public boolean removeBag(Bag bag)
	{
		//bags.remove(bag);
		return myList.removeBag(bag);
	}
	
	public List<Bag> GetAllBag(){
		return myList.getAll();
	}
	
	public Bag findBagByValueint(int value_int)
	{
		return myList.findBagByValueint(value_int);
	}
	
	public Bag findBagByValuedouble(double Value_double)
	{
		return myList.findBagByValuedouble(Value_double);
	}
	public Bag findBagByValuefloat(float Value_float)
	{
		return myList.findBagByValuefloat(Value_float);
	}
}
