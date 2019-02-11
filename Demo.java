import java.util.Arrays;
public class Demo{

public static void main(String[] args) {

 Animal animal1 = new Animal("john",22);
 Animal cat = new Cat("Mr. Cat",11);
 Animal otherCat = new Cat("Mr. Cat",11, "Cookies");
 Animal dog = new Dog("Mr. Dog",41);

 cat.setFriend(dog);
 dog.setFriend(cat);

 System.out.println(cat.getFriend());
 System.out.println(dog.getFriend());
 System.out.println("The total number of animals are "+Animal.animalCount);
 System.out.println("My favorite snack is "+ otherCat.getFavSnack());

 for(int i = 0; i<Animal.animals.length; i++){
   if(Animal.animals[i] != null){
      System.out.println(Animal.animals[i].toString());
   }
 }
}

}
