package io.sagarlamda4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionMod {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39));
		//Step 1: Sort List by last name
		Collections.sort(people,(o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
		
		//Step 2: Create the method that prints all elements in the list
		printConditional(people,condition->true);
		//Step 3: Create a methods that prints all people that have last name beginning with c
		printConditional(people,(person)->person.getLastName().startsWith("C"));

	}

	private static void printConditional(List<Person> people,Condition condition) {
		for(Person person:people) {
			if(condition.test(person)) {
				System.out.println(person.toString());
			}
		}
		
	}

	

	

}
