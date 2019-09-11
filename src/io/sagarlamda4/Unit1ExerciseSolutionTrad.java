package io.sagarlamda4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionTrad {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39));
		//Step 1: Sort List by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//Step 2: Create the method that prints all elements in the list
		printAll(people);
		//Step 3: Create a methods that prints all people that have last name beginning with c
		printLastNameBeginningWithC(people,new Condition() {

			@Override
			public boolean test(Person person) {
				// TODO Auto-generated method stub
				return person.getLastName().startsWith("C");
			}
			
		});

	}

	private static void printLastNameBeginningWithC(List<Person> people,Condition condition) {
		for(Person person:people) {
			if(condition.test(person)) {
				System.out.println(person.toString());
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person person:people) {
			System.out.println(person.toString());
		}
		
	}

	

}
