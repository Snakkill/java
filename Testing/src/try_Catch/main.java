package try_Catch;


public class main {
	

static int m() throws throwAge{
	//return 0/0;
	throw new throwAge();
}

static void n() throws throwAge{
	m();
}

	
	
	
	public static void main(String[] args) {
		
		System.out.println("LINE 1");
		
		
		try{
		
			n();
		}
		catch(Exception e){
			System.out.println("Propergates");
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
