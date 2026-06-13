public abstract class Animal {
    int age;
    Animal(int age){
        this.age=age;
    }
    void roar(){
        System.out.println("ROOOAARR!!");
    }
    abstract void speak();

}
