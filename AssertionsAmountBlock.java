package TestNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsAmountBlock {
	
	@Test
	public void WingifyTestCase_1() {
		Assert.assertTrue(true);//passed
		Assert.assertEquals("VaibhavTambe", "VaibhavTambe");//passed
		System.out.println("LoginUserName passed!");
		
	}
	
	@Test
	public void WingifyTestCase_2() {
	Assert.assertTrue(true);//passed
	Assert.assertEquals("Vaibhav@70395", "Vaibhav@70395");//passed
	System.out.println("LoginPassword passed!");
	
	}
	
	@Test
	public void WingifyTestCase_3() {
		Assert.assertTrue(true);//passed
		System.out.println("Home Page open After LogIn!");	
		
	}
	
	@Test
	public void WingifyTestCase_4() {
		
		Assert.assertTrue(true);//passed
		Assert.assertEquals("+ 1,250.00 USD", "+ 1,250.00 USD");//passed
		System.out.println("Amount for Restaurant/Cafe passed!");
		
		
	}

}
