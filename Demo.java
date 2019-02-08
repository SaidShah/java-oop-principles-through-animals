
public class Demo{

public static void main(String[] args) {

 Animal animal1 = new Animal("john",22);

 Animal cat = new Cat("Mr. Cat",11);
 Animal dog = new Dog("Mr. Dog",41);
 cat.setFriend(dog);
 dog.setFriend(cat);
 System.out.println(cat.getFriend());
 System.out.println(dog.getFriend());
 System.out.println(animal1.toString());
 System.out.println(cat.toString());
 System.out.println(dog.toString());
 System.out.println(Animal.animalId);
}

}
