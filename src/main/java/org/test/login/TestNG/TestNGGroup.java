package org.test.login.TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGGroup {
	@Test(groups= {"smoke"})
	private void logic1() {
		Assert.assertTrue(false);
		System.out.println("1");

	}
	@Test(groups={"smoke"})
	private void logic2() {
		Assert.assertTrue(false);
		System.out.println("2");

	}
	@Test(groups={"regression"})
	private void logic3() {
		Assert.assertTrue(true);
		System.out.println("3");

	}
	@Test(groups={"sanity"})
	private void logic4() {
		Assert.assertTrue(false);
		System.out.println("4");

	}
	@Test(groups={"sanity"})
	private void logic5() {
		Assert.assertTrue(true);
		System.out.println("5");

	}





}
