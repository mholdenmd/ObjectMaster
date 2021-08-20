package Charater;

public class Wizard extends Human {
	public Wizard(String nameInput) {
		super(nameInput);
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal(Human humanToHeal) {
		humanToHeal.health += this.intelligence;
	}
}
