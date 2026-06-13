public class Fish implements Predator,Prey{
    @Override
    public void hunt(){
        System.out.println("Big fishies hunting!");
    }
    @Override
    public void flee(){
        System.out.println("Small fishies fleeing!");
    }
}
