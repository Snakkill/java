package try_Catch;



public class main {
	public static void main(String[] args) {
		
		System.out.println("LINE 1");
		
		try{
			int x = 0/0;
		}
		
		catch(ArithmeticException e){
			System.out.println("Not correct");
			
		}
		
		System.out.println("LINE 2");
		
    }

}
