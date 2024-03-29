package io.sagarlamda9;

import java.util.Arrays;
import java.util.List;

import io.sagarlamda4.Person;

public class StreamExample {
	public static void main(String[] args) {
		List<Person> people=Arrays.asList(new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39));
		people.stream()
		.filter(p->p.getLastName().startsWith("C"))
		.forEach(p->System.out.println(p.getFirstName()));
		System.out.println("Streams");
		long count=people.stream().filter(p->p.getLastName().startsWith("C")).count();
		System.out.println(count);
		System.out.println("Parallel Streams");
		people.parallelStream().filter(p->p.getFirstName().startsWith("C"));
	}

}
