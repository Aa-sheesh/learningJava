import java.util.Random;

public class randomNumber5 {
    static void main(String[] args) {
        Random R = new Random();
        int n1 = R.nextInt(0,6)+1;
        double n2 = R.nextDouble(0.00,6.00)+1;
        boolean n3 = R.nextBoolean();
        System.out.println("Int: "+n1+"Double: "+n2+"Boolean: "+n3);
    }

}
