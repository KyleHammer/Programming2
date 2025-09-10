import java.util.*;

public class Farm {
	public static void main(String[] args) {
		new Farm().use();
	}

	private LinkedList<Animal> animals = new LinkedList<Animal>();

	public Farm() {
		animals.add(new Cat());
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Fish());
	}

	public void use() {
		for (Animal animal : animals){
			animal.makeNoise();

			if(animal instanceof Pettable){
				((Pettable) animal).pet();
			}
		}
	}
}
