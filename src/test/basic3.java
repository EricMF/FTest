package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basic3 {
	@AfterSuite
	public void WebLogin() {
		System.out.println("This execution will be final last");
	}

	@BeforeTest
	public void prerequesite() {

		System.out.println("I will execute this first!");
	}

	@Test
	public void testcase1() {
		System.out.println("Should be somewhere in the middle");
	}

	@AfterTest
	public void SoftwareLogin() {
		System.out.println("Ill execute last!");
	}
}
