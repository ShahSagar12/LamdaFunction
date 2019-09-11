package io.sagarlamda2;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLength words=key->key.length();
		System.out.println(words.getLength("Hello World"));
		
		printLamda(key->key.length());
	}
	public static void printLamda(StringLength args) {
	System.out.println(args.getLength("hello"));	
	}
	
	interface StringLength{
		int getLength(String word);
	}
}
