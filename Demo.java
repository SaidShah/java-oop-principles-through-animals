
public class Demo{

public static void main(String[] args) {

 Animal animal1 = new Animal("john",22);
 Animal animal2 = new Animal("mike",32);
 Animal animal3 = new Animal("rex",13);
 Animal animal4 = new Cat("Mr. Cat",11);
 Animal animal5 = new Dog("Mr. Dog",41);
 System.out.println(animal1.toString());
 System.out.println(animal2.toString());
 System.out.println(animal3.toString());
 System.out.println(animal4.toString());
System.out.println(animal5.toString());
 System.out.println(Animal.animalId);
}

}
