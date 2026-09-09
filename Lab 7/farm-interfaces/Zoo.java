import java.util.*;

public class Zoo {
	public static void main(String[] args) {
		new Zoo().use();
	}

	public Zoo() {
		
	}

	public void use() {
		LinkedList<Animal> animals = new LinkedList<>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Parrot());

		for (Animal animal : animals){
			System.out.println("A " + animal.getName() + " goes " + animal.getNoise());
		}
	}
}
