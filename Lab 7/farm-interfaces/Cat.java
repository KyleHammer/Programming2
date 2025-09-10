public class Cat extends Animal implements Pettable {
	public void makeNoise() {
		System.out.println("Meow!");
	}

	public void pet(){
		System.out.println("Cat has been pet!");
	}
}
