
public class Gorilla extends Mammal {
	public Gorilla throwSomething() {
		this.energyLevel -= 5;
		System.out.println("Gorilla has thrown something!");
		return this;
	}
	public Gorilla eatBananas() {
		this.energyLevel += 10;
		System.out.println("Gorilla has eaten something!");
		return this;
	}
	public Gorilla climb() {
		this.energyLevel -= 10;
		System.out.println("Gorilla has climbed!!");
		return this;
	}
}
