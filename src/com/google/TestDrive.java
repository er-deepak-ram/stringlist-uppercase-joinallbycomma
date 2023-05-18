// Use case: convert all strings of list to upper case and join them with comma

package com.google;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestDrive {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Johny", 30));
		empList.add(new Employee(2, "Rocky", 35));
		empList.add(new Employee(3, "Tim", 32));
		empList.add(new Employee(4, "Alex", 28));
		empList.add(new Employee(5, "Eric", 25));
		
		String names = empList.stream()
						.map(e -> e.getName())
						.map(str -> str.toUpperCase())
						.collect(Collectors.joining(",  "));
		System.out.println(names);
	}

}
