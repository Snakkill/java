package mypack;

public class Main {

	public static void main(String[] args) {
			
			System.out.println("New Package");
			
			animal zebra = new animal();
			System.out.println(zebra.Diet);
			System.out.println(zebra.weight);
			//System.out.println(zebra.age);  //wont work private
			zebra.setAge(40);
			
			System.out.println(zebra.getAge());
			
	    }
}
