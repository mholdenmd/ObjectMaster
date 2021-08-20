package TestCharater;
import Charater.Human;
import Charater.Ninja;
import Charater.Wizard;

public class HumanTest {
 public static void main(String[] args) {
	 Human h1 = new Human ("Traice");
	 Human h2 = new Human ("Ian");
	 Human h3 = new Human ("Messiah");
	 
	 Wizard w1 = new Wizard("Oz");
	 
	 Ninja n1 = new Ninja("Ash");
	 
	 
	 
	 
	 h3.displayinfo();
	 h1.attack(h3);
	 h3.displayinfo();
	 w1.heal(h3);
	 h3.displayinfo();
	 n1.steal(h3);
	 h3.displayinfo();
	 
	 
 }
 
}
