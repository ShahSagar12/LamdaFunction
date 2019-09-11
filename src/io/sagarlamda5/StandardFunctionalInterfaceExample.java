package io.sagarlamda5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.sagarlamda4.Person;

public class StandardFunctionalInterfaceExample {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39));

		Collections.sort(people,(Person o1, Person o2)-> o1.getLastName().compareTo(o2.getLastName()));
		System.out.println("Printing all Person");
		performConditionally(people,p->true,p->System.out.println(p));

		performConditionally(people,p->p.getLastName().startsWith("C"),p->System.out.println(p));
		
		performConditionally(people, p->p.getFirstName().startsWith("C"),p->System.out.println(p));

	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,Consumer<Person> consumer) {
		for(Person person:people) {
			if(predicate.test(person)) {
				consumer.accept(person);
			}
		}
		
	}

}
