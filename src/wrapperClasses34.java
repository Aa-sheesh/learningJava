public class wrapperClasses34 {
    /*
        Wrapper classes= allow primitive values(int,char,double, boolean) to be uses as objects.
        => Wrap them in a object
        Generally, don't wrap primitives unless you need an object
        Allows use of collections framework and static utility methods
     */

    static void main(String[] args) {
        //    primitive data type
//    int a=123;

//    Integer a = new Integer(123);
//    Double b = new Double(123.99);
//    Character c = new Character('$');
//    Boolean d= new Boolean(true);
//    String e= new String("Hey!");
        //Deprecated after Java version 9
//    => Follows autoboxing (primitive data type -> object)
        Integer a=123; //and so on
//    Unboxing (object -> primitive data type)
        int x=a;

//        Confirming object type
//        System.out.println(a.equals(123));
//        System.out.println(x.equals(123));//Error

        //String to primitive data types
        int b=Integer.parseInt("123");
        char c ="Pizza".charAt(0);

    }

}
