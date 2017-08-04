package assignment15;

public class ThreadWithdrawal implements Runnable  {      //here created a class which implements runnable interface
	
	Provider provider;
	
       
	public ThreadWithdrawal(Provider provider){  //creating a constructor 
	this.provider = provider; 
	new Thread(this).start();                //creating
	
	}
	public void run(){ //creating run method to start the thread 
		int number=1;          //created an int variable and initialized the value
		while(number<=10){      //here it checks the condition and prints the withdrawal method
			provider.withdrawalMethod();
			number++;
			
	}
		
	}
}
