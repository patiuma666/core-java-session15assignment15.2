package assignment15;

public class ThreadDeposit implements Runnable { //created ThreadDeposit class which implements runnable
	
	Provider provider; //creating an variable to provide a constructor
	
	public ThreadDeposit(Provider provider){ //created a parameterized constructor
		this.provider = provider;
		new Thread(this).start();  //here it execute the thread 
	}
	  
	public void run(){  //here it created run method
		int number = 1;
		while( number<=10){        //it checks the condition 
			provider.depositMethod();//and increment the deposit method
			number++;
			
		}
	}
	
}
