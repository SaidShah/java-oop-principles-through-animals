public class Dog extends Animal{
  private String friendName;
  public Dog(String name, int age){
    super(name, age);
  }

  @Override
  public void setFriend(Animal animal){
    this.friendName=animal.name;
  }

  public String getFriend(){
    return "I'm a Dog and friend's name is "+this.friendName;
  }

  public String toString(){
    return "My name is " +this.name + " I'm "+this.age+" years old and im a Dog";
  }
}
