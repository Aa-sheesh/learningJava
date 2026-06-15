public class multiThreading44 {
    static void main(String[] args) {
        /*
            Multi threading = Enables a program to run multiple threads concurrently
            (Thread = a set of instructions that run independently)
            Useful for bg tasks or time-consuming operations
         */

//        MyRunnable1 myrun=new MyRunnable1();
//        Thread th=new Thread(myrun);
        Thread th1 = new Thread(new MyRunnable1("PING"));
        Thread th2 = new Thread(new MyRunnable1("PONG"));

        System.out.println("GAME START");

        try{
            th1.start();
            th2.start();
            th1.join();
            th2.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("GAME OVER");
    }
}
