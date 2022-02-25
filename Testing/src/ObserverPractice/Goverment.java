package ObserverPractice;

public class Goverment {
	public static void main(String[] args) {
		PostOffice postoffice = new PostOffice();
		
		Person Ayman = new Person("Ayman");
		Person Mike = new Person("Mike");

		
		//Ayman and Mike were bugging/polling the post office, but null no passports there
				Ayman.checkArrivalTheirPassport(null);
				Mike.checkArrivalTheirPassport(null);
				
		//post office was angry and asked them to subscribe
				postoffice.subscribe(Ayman);
				postoffice.subscribe(Mike);

		//Passport arrives
		Passport passport = new Passport("Ayman", "Ayman address", "You've got a secret passport");
		postoffice.ppOfficeSendsaPPPostOffice(passport);
	}
}
