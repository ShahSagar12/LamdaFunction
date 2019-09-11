package io.sagarlamda6;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		int[] someNumber= {1,2,3,4};
		int key=0;
		process(someNumber,key,wrapperLamda((v,k)-> System.out.println(v/k)));

	}

	private static void process(int[] someNumber, int key,BiConsumer<Integer,Integer> consumer) {
		for(int num:someNumber) {
			consumer.accept(num, key);;
		}
	}
	private static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer,Integer> consumer) {

		return (v,k)->{
			try {
			consumer.accept(v, k);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		};
	}
}
