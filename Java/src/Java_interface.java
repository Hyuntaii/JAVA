
public class Java_interface {

	public static void main(String[] args) {
		
		
		Animal dog = new Dog("baduk");
		Animal cat = new Cat("nyaong");
		Animal wolf = new Wolf("waoooo");
		
		Pet pet1 = new Cat("nyaong");
		Pet pet2 =new Dog("baduk");
		Pet pet3 = new Wolf("Waoooo");
		
		pet1.FoodCall();
		pet2.FoodCall();
		pet3.FoodCall();
		
		((Cat)pet1).Cry();
	}

}
