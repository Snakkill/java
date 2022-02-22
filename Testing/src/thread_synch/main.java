package thread_synch;

public class main {
	
	public static void main(String[] args) {
		JointResource JointResource = new JointResource();
		Women womenThread = new Women(JointResource);
		Man manThread = new Man(JointResource);

		womenThread.start();
		manThread.start();
	}
}
