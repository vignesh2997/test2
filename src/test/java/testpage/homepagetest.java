package testpage;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.basepage;
import pageobject.homepageobject;

public class homepagetest {
	homepageobject homepage;
	basepage bp;

	public homepagetest() {
		homepage = new homepageobject();
		bp = new basepage();
	}

	@Test
	private void womenBox() {
		homepage.getWomen().click();
		String verify = homepage.getTextWomen();
		Assert.assertTrue(verify.contains("WOMEN"), "fail");
	}

	@Test
	private void dressbox() {
		homepage.getDress().click();

	}

}
