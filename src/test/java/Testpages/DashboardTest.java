package Testpages;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Basetest;

import pages.Dashboard;
import pages.Loginpage;

public class DashboardTest extends Basetest {
 Loginpage lp;
 Dashboard dp;
	@Test
	public void verifyproductlink() throws InterruptedException {
		lp=new Loginpage(driver);
		lp.gotourl();
		lp.perfromlogin();
		String expectedvalue="Dashboard";
		dp=new Dashboard(driver);
		String actualvalue=dp.getpageTitle();
		Assert.assertEquals(actualvalue,expectedvalue);
		dp.clickonProductlink();
		
		
	}
}
