package Charater;

public class Samurai extends Human {
	
	protected static int samurai_count =  0;
	
	public Samurai (String nameInput) {
		super(nameInput);
		this.health = 200;
	}
	
		   //Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half
    public void deathBlow(Human victim) {
        victim.health = 0;
        this.health /= 2;
    }

    //Add a method meditate() that heals the Samurai for half of their current health.
    public void meditate() {
        this.health += this.health/2;
    }

    //Add a method howMany() that returns the total current number of Samurai.
    public int howMany() {
        return samurai_count;
    }

}
