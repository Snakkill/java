package ObserverPractice;

import java.util.ArrayList;
import java.util.Observer;

public class PostOffice implements Subject {
	
	private ArrayList<Passport> allReceviedPassport;
	private ArrayList<Observer> observerSubscribersLedger;
	
	public PostOffice()
	{
		allReceviedPassport = new ArrayList<>();
		observerSubscribersLedger = new ArrayList<>();
	}
@Override
	public void subscribe(Observer o) {
		
		observerSubscribersLedger.add(o);

	}

	@Override
	public void unSubscibe(Observer o) {
		// TODO Auto-generated method stub
		observerSubscribersLedger.remove(o);

		
	}

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observerSubscribersLedger.size(); i++)
			observerSubscribersLedger.get(i).update(null, this);
		
	}

	public ArrayList<Passport> getAllRecivedPPatPO()
	{
		return allReceviedPassport;
	}
	
	public void ppOfficeSendsaPPPostOffice(Passport m){
		allReceviedPassport.add(m);
		Notify();
	}
}

