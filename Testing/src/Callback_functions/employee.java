package Callback_functions;

public class employee {
	
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
