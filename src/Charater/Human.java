package Charater;

public class Human {
	
	protected Integer strength = 3;
	protected Integer stealth = 3;
	protected Integer intelligence = 3;
	protected Integer health = 100;
	protected String name;
	
	public Human(String nameInput) {
		this.name = nameInput;
	}
	
	
	   public void displayinfo() {
		   System.out.println(String.format("Health of %s: %d. Strength: %d. Intelligence: %d.",this.name, this.health, this.strength, this.intelligence, this.stealth));
	   }
	   
	   public void attack(Human target) {
		   System.out.println(String.format("%s is attacking %s", this.name, target.name));
		   target.health -= this.strength;
	   }
	   public Integer getStrength() {
		   return this.strength;
				   
	   }
	   }
	


	

