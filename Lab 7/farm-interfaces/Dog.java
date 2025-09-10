public class Dog extends Animal implements Pettable {
	public void makeNoise() {
		System.out.println("Woof!");
	}

	public void pet(){
		System.out.println("Dog has been pet!");
	}
}
