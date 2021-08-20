package Charater;

public class Ninja extends Human {
	public Ninja(String nameInput) {
		super(nameInput);		
		this.stealth = 10;
		this.health = 100;
		
	}
	
	public void steal(Human stealFromOther) {
		stealFromOther.health -= this.stealth;
		this.health += 10;
		
	}
}

