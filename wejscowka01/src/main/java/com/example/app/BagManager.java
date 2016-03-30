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
	
	public Bag FindBag_ByValue_int(int value_int)
	{
		return myList.FindBag_ByValue_int(value_int);
	}
	
	public Bag FindBag_ByValue_double(double Value_double)
	{
		return myList.FindBag_ByValue_double(Value_double);
	}
	public Bag FindBag_ByValue_float(float Value_float)
	{
		return myList.FindBag_ByValue_float(Value_float);
	}
}
