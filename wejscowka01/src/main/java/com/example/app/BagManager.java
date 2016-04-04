package com.example.app;
import java.util.ArrayList;
import java.util.List;

public class BagManager{

	
	public IMyList myList;
	public BagManager(IMyList myList){
		this.myList = myList;
	}
	
	public boolean addBag(Bag bag)
	{
		return myList.addBag(bag);
	}
	
	public boolean removeBag(Bag bag)
	{
		return myList.removeBag(bag);
	}
	
	public List<Bag> GetAllBag(){
		return myList.getAll();
	}
	
	public Bag findBagByValueInt(int valueInt)
	{
		return myList.findBagByValueInt(valueInt);
	}
	
	public Bag findBagByValueDouble(double ValueDouble)
	{
		return myList.findBagByValueDouble(ValueDouble);
	}
	public Bag findBagByBool(boolean ValueBool)
	{
		return myList.findBagByBool(ValueBool);
	}
}
