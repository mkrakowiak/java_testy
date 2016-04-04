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
	
	public Bag findBagBySzerokosc(int szerokosc)
	{
		return myList.findBagBySzerokosc(szerokosc);
	}
	
	public Bag findBagByWaga(double waga)
	{
		return myList.findBagByWaga(waga);
	}
	public Bag findBagByLotniczy(boolean lotniczy)
	{
		return myList.findBagByLotniczy(lotniczy);
	}
}
