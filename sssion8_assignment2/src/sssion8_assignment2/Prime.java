package sssion8_assignment2;

public class Prime implements Runnable {
	 
	int num;
	//constructor to initialize variable start thread
	Prime(int i){
		num=i;
		Thread t1=new Thread(this);
    System.out.println("thread t1 is created");
    t1.start();
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//checking the no is prime or not
		try{
	         
	        for(int i=2; i<=num/2; i++){
	            if(num % i == 0){
	            	System.out.println("number is not prime");
	            	return;
	            }
	        }
	        System.out.println("number is prime");
		}
            catch(Exception e)
               {
                    System.out.println(e);
               }		
	}
}