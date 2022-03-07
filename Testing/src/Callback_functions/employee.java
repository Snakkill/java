package Callback_functions;

public class employee extends Thread {
	
	
	PayAccount thisRequest;
	
	public employee(PayAccount payResquest){
		thisRequest = payResquest;
	}
	
	public void run(){
		super.run();
		working(thisRequest);
	}
	
	
	
	public void working(PayAccount payResquest){
		System.out.println("Start WORK!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Pay me");
		payResquest.onSuccess();
	}
	
}
