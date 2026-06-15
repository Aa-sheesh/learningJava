import java.util.HashMap;

public class hashMaps41 {
    static void main(String[] args) {
        /*
            Hashmap = a data structure that stores key value pairs
            Keys are unique, but values can be duplicated
            Does not maintain any order, but is memory efficient
            HashMap<Key,Value>
         */

        HashMap<String,Double> map =new HashMap<>();
        map.put("apple",0.50);
        map.put("orange",0.75);
        map.put("banana",0.25);

        System.out.println(map); //{orange=0.75, banana=0.25, apple=0.5}
        map.remove("apple");
        System.out.println(map.get("banana"));
        System.out.println(map.containsKey("banana"));
        System.out.println(map.containsValue(0.75));
        System.out.println(map.size());

        //Printing map
        for(String key: map.keySet()){
            System.out.println(key +" : "+map.get(key));
        }

    }
}
