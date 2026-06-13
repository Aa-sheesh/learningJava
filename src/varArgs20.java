public class varArgs20 {
    static void main(String[] args) {
        /*
            var args = allow a method to accept a varying number of arguments, makes methods more flexible, no need for overloaded function, java packs argument into array
            ...()
         */

        System.out.println(average(1,2,3,6));
    }
    static double average(double ... numbers){
        double sum=0;
        for (double num:numbers){
            sum+=num;
        }
        return sum;
    }
}
