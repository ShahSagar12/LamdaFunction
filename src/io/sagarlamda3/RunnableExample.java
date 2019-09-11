package io.sagarlamda3;

public class RunnableExample {
	
	
	public static void main(String[] args) {
		
		Thread myThread=new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside Runnable");	
			}
		});
		myThread.run();
		// my lamda thread
		Thread myLamdaThread=new Thread(()->System.out.println("Printed from lamda runnable"));
		myLamdaThread.run();
	}

}
