package io.sagarlamda1;

public class Greeting {
	
	static void greet(GreetDao greet) {
		
		
		greet.perform();
	}
	
	public static void main(String[] args) {
		Greeting greeter=new Greeting();
//        List<String> list = new ArrayList<String>(); 
//        list.add("Geeks"); 
//        list.add("For"); 
//        list.add("GEEKS"); 
//        list.forEach(Greeting::greet);
		
		
		
		//Annonymous innerclass
		GreetDao greetDao=new GreetDao() {
			@Override
			public void perform() {
				System.out.println("Hello World");				
			}			
		};
		
		GreetDao lamdaGreeting = ()->System.out.println("Hello World"); 
		System.out.print(lamdaGreeting);
		lamdaGreeting.perform();
		greetDao.perform();
		
		//-----------------------calling Function-----------------------
		greeter.greet(lamdaGreeting);
		greeter.greet(greetDao);
		
		greeter.greet(()->System.out.println("Hello World"));
		
	}

}
