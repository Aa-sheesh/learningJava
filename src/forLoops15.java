public class forLoops15 {
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // If something interrupts the sleep, handle it here
                System.out.println("The countdown was interrupted!");
                // Optionally stop the loop
                break;
            }
        }
        System.out.println("BOOM");
    }
}