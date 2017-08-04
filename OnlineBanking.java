package assignment15;

public class OnlineBanking {   //created a class Test
 
	public static void main(String[] args) { //created main method 
		
		Provider provider =new Provider(); //created an object here for the class provider 
		new ThreadDeposit(provider);       // created the threads which calls the runnable 
		new ThreadWithdrawal(provider); 
		
		
	}

	
	
}
