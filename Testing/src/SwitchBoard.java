
public interface SwitchBoard {
 void SwitchOne();
 void SwitchTwo();
 void SwitchThree();
 default void SwitchFour(){
	 System.out.println("New Default Method");
	 };
}
