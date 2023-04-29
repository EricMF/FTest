package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class basic4 {
	@Test
	public void WebGame() {
		System.out.println("Web Game");
	}

	@Test
	public void GameMobileGame() {
		System.out.println("Mobile game");
	}

	@Test
	public void GameSoftwareGame() {
		System.out.println("Software game");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is very first code or action happens before executing any tests");
	}
	
}
