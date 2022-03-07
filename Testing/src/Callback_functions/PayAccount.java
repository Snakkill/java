package Callback_functions;

public class PayAccount implements Payroll {

	@Override
	public void onSuccess() {
		System.out.println("Paying complete");
		
	}

	@Override
	public void onFail() {
		// TODO Auto-generated method stub
		
	}

}
