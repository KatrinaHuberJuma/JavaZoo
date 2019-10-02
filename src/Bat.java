
public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	public Bat fly() {
		System.out.println("Shwooom!");
		this.energyLevel -= 50;
		return this;
	}
	public Bat eatHumans() {
		System.out.println("OMnomnom....nom");
		this.energyLevel += 25;
		return this;
	}
	public Bat attackTown() {
		System.out.println("Fire!");
		this.energyLevel -= 100;
		return this;
	}
	
}
