package thread_synch;

public class Man extends Thread {

	JointResource account;
	
	public Man(JointResource jointAccount) {
	

		account = jointAccount;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		account.deposit(10000);
	}
}
