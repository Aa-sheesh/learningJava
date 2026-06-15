import java.util.Timer;
import java.util.TimerTask;

public class anonymousClassesAndTimerTask39 {
    static void main(String[] args) {
        /*
            Anonymous class = A class that doesn't have a name. Cannot be reused.
            Add a custom behaviour without having to create a newclass
            Often used for ine time uses(TimerTask,Runnable,callbacks)

         */

        Dog dog = new Dog(12) {
            @Override
            public void speak() {
                System.out.println("Dog says meow!");
            }
        };
        dog.speak();

        /*
            Timer = Class that schedules tasks at specific times or periodically
                Useful for : sending notifications, scheduled updates, repetitive actions
            TimerTask = Represents the task that will be executed by the timer.
            You will extend the TimerTask class to define your task
            Create a sublass of TimerTask and @Override run()
         */

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                if (count < 0) {
                    System.out.println("Task Done");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 1000);

    }
}
