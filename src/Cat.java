public class Cat extends Animal{

    Cat(int age) {
        super(age);
        /*
        super(age) means Animal(age) constructor => initialises Animal parent class with the help of constructor
         */
    }

    @Override
    void roar(){
        System.out.println("The cat meows");
    }

    @Override
    public String toString(){
        return "I am a cat of"+age;
    }

    @Override
    void speak(){
        System.out.println("The cat goes meow!");
    }

}
