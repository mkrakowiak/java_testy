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
	
	@When("add to list $a $b $c")
	public void setArguments(int a, boolean b, double c){
		BagManager bagManager = new BagManager();
		int SizeBeforeAdd = 0;

		Bag cos = new Bag(a,b,c);

		bagManager.addBag(cos);

		int SizeAfterAdd = bagManager.bags.size();

		int Sub = SizeAfterAdd - SizeBeforeAdd;
	}
	
    @Then("adding should return size $result")
	public void shouldAdd(int result){
    	assertEquals(1, result);
	}
    
}



