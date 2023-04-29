package test;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class basic1 {

	@Test
	public void testCase1() {
		List<String> names = Arrays.asList("Tom", "Saka", "Paul", "Bryan", "Omatikaya");
		names.stream().sorted().filter(s -> s.contains("t")).forEach(s -> System.out.println(s));
	}

	@Test
	public void testCase2() {

		String name = "Erpolat", rName = "";
		char ch;
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			rName = ch + rName;
		}
		System.out.println(rName);
	}

	@AfterMethod
	public void testCase3() {
		System.out.println("some explanations after each test");
	}
}
