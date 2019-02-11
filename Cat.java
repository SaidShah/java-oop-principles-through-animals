public class Cat extends Animal{
  private String friendName;
  public String favSnack;

  public Cat(String name, int age){
    super(name, age);
  }

  public Cat(String name, int age, String favSnack){
    super(name,age);
    this.favSnack = favSnack;
  }

  @Override
  public void setFriend(Animal animal){
    this.friendName = animal.name;
  }

  public void setFavSnack(String snack ){
    this.favSnack = snack;
  }

  public String getFavSnack(){
    return this.favSnack;
  }

  public String getFriend(){
    return "I'm a Cat and my friend is " +this.friendName;
  }

  public String toString(){
    return "My name is " +this.name + " I'm "+this.age+" years old and im a Cat";
  }


}
