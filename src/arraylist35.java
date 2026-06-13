import java.util.ArrayList;
import java.util.Collections;

public class arraylist35 {
    static void main(String[] args) {
        /*
            ArrayList = A resizeable array that stores objects (autoboxing)
                Arrays are fixed in size, but arraylists can change
         */
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(2);


        list.remove(1);
        System.out.println(list);
        list.set(0,4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }
}
