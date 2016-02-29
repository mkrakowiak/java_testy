package com.example.app;
import java.util.ArrayList;
import java.util.List;

public class BagManager{

	private List<Bag> listA = new ArrayList<Bag>();
	
	public void Add(int number, Bag bread)
	{
		this.listA.add(number, bread);
	}
	
	public void Remove(int number)
	{
		this.listA.remove(number);
	}
	
	public int getSize()
	{
		return this.listA.size();
	}
}
