package ObserverPractice;

import java.util.Observer;

public interface Subject {
	void subscribe(Observer o);
	void unSubscibe(Observer o);
	void Notify();
} 

