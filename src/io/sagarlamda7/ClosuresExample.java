package io.sagarlamda7;

public class ClosuresExample {

	public static void main(String[] args) {
		int a=20;
		//Closures
		int b=40;
		
//		doProcess(a,new Process() {
//			@Override
//			public void process(int i) {
//				System.out.println(i+b);
//			}
//		});
		
		doProcess(a,i->System.out.println(i+b));


	}
	public static void doProcess(int i,Process process) {
		process.process(i);
	}
}

interface Process{
	public void process(int i);
}
