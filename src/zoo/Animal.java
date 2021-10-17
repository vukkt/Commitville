package zoo;

public abstract class Animal {

	String picture;
	String food;
	int hunger;
	int boundaries;
	int location;

	void makeNoise()

	{
		System.out.println("making noise");
	}

	void eat()

	{
		System.out.println("eating");
	}

	void sleep()

	{
		System.out.println("sleeping");
	}

	void roam()

	{
		System.out.println("roaming");
	}

	public static void main(String[] args) {

	}

}
