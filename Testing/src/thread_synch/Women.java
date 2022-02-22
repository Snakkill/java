package thread_synch;

public class Women extends Thread{
	JointResource account;

	public Women(JointResource jointAccount) {
		
		account = jointAccount;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub

		account.withDraw(15000);
		super.run();
	}
}
