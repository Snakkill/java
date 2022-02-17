package mypack;

public class Students implements Runnable {
	
    private String message;  
    
    
    public Students(String s){  
        this.message=s;  
    }  
    
    
	public void run() {  
	        System.out.println(Thread.currentThread().getName()+" Hello "+message);  
	        processmessage();
	        System.out.println(Thread.currentThread().getName()+" Goodbye");//prints thread name  
	    }  
	    private void processmessage() {  
	        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
	    }  
	    
	    
	}  