public class Animal{

  public static int animalCount=0;
  protected String name;
  protected int age;
  protected String friendName;
  protected String favSnack;
  public static Animal[] animals = new Animal[10];

  public Animal(String name, int age){
    this.name = name;
    this.age = age;
    this.animals[this.animalCount++] = this;
  }

  public Animal(String name, int age, String favSnack){
    this.name = name;
    this.age = age;
    this.favSnack = favSnack;
    this.animals[this.animalCount++] = this;
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

  public void setFavSnack(String favSnack){
    this.favSnack = favSnack;
  }

  public String getFavSnack(){
    return this.favSnack;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String toString(){
    return "My name is "+ this.name + " and my age is "+this.age;
  }

}
