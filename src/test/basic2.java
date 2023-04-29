package test;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basic2 {
	@Test
	public void Demo() {
		List<Integer> nums = Arrays.asList(1, 2, 5, 7, 9, 5, 4, 3, 7, 9, 3, 2, 3, 1, 1, 1, 5, 6, 8, 9, 0, 9, 7, 6);
		nums.stream().distinct().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println("");
	}

	@Test
	public void Demo2() {
		String surname = "Matchanov";
		StringBuilder rSurname = new StringBuilder();
		rSurname.append(surname).reverse();
		System.out.println(rSurname);
	}

	@BeforeMethod
	public void method() {
		System.out.println("Before any test in specific class in basic2");
	}

	@Test
	public void Demo3() {
		String fullname = "Erpolat Matchanov";
		char[] reverse = fullname.toCharArray();
		for (int i = reverse.length - 1; i >= 0; i--) {
			System.out.print(reverse[i]);
		}
		System.out.print("\n");
	}
}
