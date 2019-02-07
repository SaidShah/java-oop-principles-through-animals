public class Dog extends Animal{
  public Dog(String name, int age){
    super(name, age);
  }



  public String toString(){
    return "My name is " +this.name + " I'm "+this.age+" years old and im a Dog";
  }
}
