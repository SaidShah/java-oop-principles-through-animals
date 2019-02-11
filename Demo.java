import java.util.Arrays;
public class Demo{

public static void main(String[] args) {

 Animal animal1 = new Animal("john",22);

 Animal cat = new Cat("Mr. Cat",11);
 Animal dog = new Dog("Mr. Dog",41);
 cat.setFriend(dog);
 dog.setFriend(cat);
 System.out.println(cat.getFriend());
 System.out.println(dog.getFriend());

 for(int i = 0; i<10; i++){
   if(Animal.animals[i] != null){
      System.out.println(Animal.animals[i].toString());

   }
 }
}

}
