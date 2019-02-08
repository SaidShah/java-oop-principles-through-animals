public class Animal{

  public static int animalId;
  protected String name;
  protected int age;
  protected String friendName;

  public Animal(String name, int age){
    this.name = name;
    this.age = age;
    this.animalId++;
  }

  public String getFriend(){
    return this.friendName;
  }

  public void setFriend(Animal animal){
    this.friendName = animal.name;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String toString(){
    return "My name is "+ this.name + " and my age is "+this.age;
  }

}
