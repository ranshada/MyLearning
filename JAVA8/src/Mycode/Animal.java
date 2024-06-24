package Mycode;

class Animal {
	String name;

	public Animal() {
		this.name = "Default Name";
		System.out.println(name);
	}
	{
		System.out.println("Instance Initializer");
	}

// This is called a one argument constructor.
	public void Animal1(String name) {
		
		this.name = name;
		System.out.println(name);

	}

	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal animal1 = new Animal();

		Animal animal2 = new Animal();

		
	
	
	}
}
