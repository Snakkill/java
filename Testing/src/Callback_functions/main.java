package Callback_functions;

public class main {
	public static void main(String[] args) {
		employee Employee = new employee();
		PayAccount BankAccount = new PayAccount();
		Employee.working(BankAccount);
	}
}
