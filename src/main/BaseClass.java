package main;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BaseClass {

	BaseClass() {
		System.out.println("hello static");
	}

	public static void main(String[] args) {

		BaseClass base = new BaseClass();
		base.configure();

	}

	public void configure() {

		Set<Integer> set = new TreeSet<>(List.of());
		System.out.println(set);
	}

}
