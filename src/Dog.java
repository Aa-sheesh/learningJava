public class Dog extends Animal{
    Dog(int age){
        super(age);
    }

    @Override
    public void speak(){
        System.out.println("The dog says WOOOF!");
    }
}
