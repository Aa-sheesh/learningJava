import java.util.ArrayList;

public class generics40 {
    static void main(String[] args) {
        /*
            Generics = A concept where you can write a class,interface pr method that is compatible with different data types.
            <T> type parameter (placeholder that gets replaced with a real type)
            <String> type argument (specifies the type)
         */

        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

//        Example of Generic -> check Box class
        Box<String> box1=new Box<>();
        box1.setItem("banana");
        System.out.println(box1.getItem());

        Box<Integer> box2=new Box<>();
        box2.setItem(1);
        System.out.println(box2.getItem());
    }
}
