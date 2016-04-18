package com.example.app;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class BagManagerSteps {
	
	@Given("a bag")
	public void bagSetup(){
		BagManager bagManager = new BagManager();
	}
	
	@When("add to list weight $weight is air $air width $width")
	
	
	public void setArguments(int weight, boolean air, double width){
		BagManager bagManager = new BagManager();
		int SizeBeforeAdd = 0;

		Bag cos = new Bag(weight,air,width);

		bagManager.addBag(cos);

		int SizeAfterAdd = bagManager.bags.size();

		int Sub = SizeAfterAdd - SizeBeforeAdd;
	}
	
    @Then("adding should return size $result")
	public void shouldAdd(int result){
    	assertEquals(1, result);
	}
	
	@When("remove from list when weight is $weight is $air true width $width")
	public void removeArguments(int weight, boolean air, double width){
		int SizeBeforeAdd = 0;
		BagManager bagManager = new BagManager();
		Bag cos = new Bag(weight,air,width);
		bagManager.addBag(cos);
		
		int SizeAfterAdd = bagManager.bags.size();

		int Sub = SizeAfterAdd - SizeBeforeAdd;

		assertEquals(1, Sub);

		bagManager.removeBag(cos);

		int SizeAfterRemove = bagManager.bags.size();
	}
	
    @Then("remove should return size $result")
	public void shouldRemove(int result){
    	assertEquals(0, result);
	}
    
}



