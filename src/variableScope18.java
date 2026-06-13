public class variableScope18 {
    int x=4; //Global scope
    void main(String[] args) {
        System.out.println(x);
        doSomething();
    }
    static void doSomething(){
        int x=2;//Local Scope
        System.out.println(x);
    }
}
