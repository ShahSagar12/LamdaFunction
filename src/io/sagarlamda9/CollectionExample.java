package io.sagarlamda9;

import java.util.Arrays;
import java.util.List;

import io.sagarlamda4.Person;

public class CollectionExample {
	
	public static void main(String[] args) {
		
		List<Person> people=Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39));
		
		System.out.println("Using For loop");
		for(int i=0;i<people.size();i++) {
			System.out.println(people.get(i));
		}
		System.out.println("For in Loop");
		for(Person person:people) {
			System.out.println(person);
		}
		System.out.println("Lamda functions for Each");
		people.forEach(System.out::println);
	}

}
