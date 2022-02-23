package try_Catch;



public class main {
	public static void main(String[] args) {
		
		System.out.println("LINE 1");
		
		try{
			int x = 0/0;
		}
		
		catch(ArithmeticException e){
			System.out.println("Not correct");
			
		}finally {
			System.out.println("Line 2");
	    }
		
		System.out.println("LINE 3");
		
		
		int age=10;
		if(age<60){
			try {
				throw new throwAge();
			} 
			catch (throwAge e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException e){
				
			}
			
			catch(Exception e){
				
			}//super class
		}
		
    }
	
	
	

}
