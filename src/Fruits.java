
public class Fruits {

	String name, colour, taste;
	double price, weight;
	
	public Fruits(String name) {
		this.name = name;
		System.out.println("Fruit constructor is invoked");
		
	}
}

class Apple extends Fruits{
	public Apple(String name, double price) {
		super(name);
		this.price = price;
		
		System.out.println(this.name + " constructor is invoke");
		System.out.println("Price per kg is: RM" + this.price);
		
	}
}

class redApple extends Apple{
	public redApple(String name, String colour, double price) {
		super(name,price);
		this.colour = colour; 
		
		System.out.println("Colour is: " + this.colour);
		
	}
}

class greenApple extends Apple{
	public greenApple(String name, String colour, double price) {
		super(name,price);
		this.colour = colour; 
		
		System.out.println("Colour is: " + this.colour);
	}
}

class Guava extends Fruits{
	public Guava(String name, double price, double weight) {
		super(name);
		this.price = price; 
		this.weight = weight;
		
		System.out.println(this.name + " constructor is invoke");
		System.out.println("Price per kg is: RM" + this.price);
		System.out.println("Weight is: " + this.weight +"kg"); 
	}
}

class strawberryGuava extends Guava{
	public strawberryGuava(String name, double price, double weight, String colour) {
		super(name,price,weight);
		this.colour = colour;

		System.out.println("Colour is: " + this.colour);
	}
}

class TropicalWhiteGuava extends Guava{
	public TropicalWhiteGuava(String name, double price, double weight, String colour) {
		super(name,price,weight);
		this.colour = colour;
		
		System.out.println("Colour is: " + this.colour);
	}
} 

class Mango extends Fruits{
	public Mango(String name, double price, double weight) {
		super(name);
		this.price = price;
		this.weight = weight; 
		
		System.out.println(this.name + " constructor is invoke");
		System.out.println("Price per kg is: RM" + this.price);
		System.out.println("Weight is: " + this.weight + "kg");
	}
}

class yellowMango extends Mango{
	public yellowMango(String name, double price, double weight, String colour, String taste) {
		super(name,price,weight);
		this.colour = colour;
		this.taste = taste;
		
		System.out.println("Colour is: " + this.colour);
		System.out.println("Taste is: " + this.taste);
	}
}

class greenMango extends Mango{
	public greenMango(String name, double price, double weight, String colour, String taste) {
		super(name,price,weight);
		this.colour = colour;
		this.taste = taste;
		
		System.out.println("Colour is: " + this.colour);
		System.out.println("Taste is: " + this.taste);
		
	}
}

class Main{
	public static void main(String[] args) {
		
		Apple a = new Apple("Apple", 16.50);
		System.out.println();
		
		redApple b = new redApple("Fuji", "Red", 19.50);
		System.out.println();
		
		greenApple c = new greenApple("Granny Smith", "Green", 17.90);
		System.out.println();
		
		Guava d = new Guava("Guava", 14.50, 0.7);
		System.out.println();
		
		strawberryGuava e = new strawberryGuava("Strawberry Guava", 16.90, 0.5, "Pink");
		System.out.println();
		
		TropicalWhiteGuava f = new TropicalWhiteGuava("Tropical White Guava", 18.50, 0.7, "Green");
		System.out.println();
		
		Mango g = new Mango("Mango", 10.50, 0.4);
		System.out.println();
		
		yellowMango h = new yellowMango("Honey Mango", 14.50, 0.7, "Yellow", "Sweet");
		System.out.println();
		
		greenMango i = new greenMango("Sour Mango", 12.50, 0.9, "Green", "Sour");
		
		
	}
}