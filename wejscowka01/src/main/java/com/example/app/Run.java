package com.example.app;


public class Run {

	public static void main(String[] args) {
		
		Bag app = new Bag(new IBagManager() {
				 List<Bag> bags = new ArrayList<Bag>();
	
			@Override
			public void addBag(Bag bag); {
				if (bag == bag){
					 bags.add(bag);
				 }
			}

			@Override
			public 	void removeBag(Bag bag);{
				if (bag == bag) bags.remove(bag);
			}
		});
	}

}
