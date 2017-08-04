package assignment15;

public class Provider { //created a class provider
	int number = 1;           // initializinng some variables  
	int orderNumber = 1;
	Boolean condition = false;        //created a boolean condition it calls when the condition is satisfies  it calls wait method
	
	 public synchronized void depositMethod(){ //here i have created a synch method 
		 while (condition){            //created a while loop  to check 
			 try{
				 wait();              //here the method it true it wait by calling wait()method
			 }catch(InterruptedException e){//while using wait method its gives an exception to handle it we use try catch
				 e.printStackTrace();
			 }
		 }
		
		System.out.println("deposit " +number);   //it prints the number
		number++; //it increment the and if the condition is true it calls notify method 
		condition = true;
		notify(); //when we notify this the thread which is waiting checks the condition 
	}

	 public synchronized void withdrawalMethod(){ //here  taken another method withdrawal 
		 while( !condition){
			 try{                          //checks the condition
				 wait();
			 }catch (InterruptedException e ){
				 e.printStackTrace();
		 }
			 
		 }

			System.out.println("withdrawal " +orderNumber); //if the condition is false here it notify the thread and checks the condition 
			orderNumber++;
		    condition = false;
		    notify();    //which is on waiting
	 }
}
