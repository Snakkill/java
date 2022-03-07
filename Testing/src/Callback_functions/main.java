package Callback_functions;

public class main {
	public static void main(String[] args) {
		System.out.println("Ready to go out of town");
		PayAccount BankAccount = new PayAccount();
		employee Employee = new employee(BankAccount);
	//	Employee.working(BankAccount);
		Employee.start();
		System.out.println("Left town");
	}
}
