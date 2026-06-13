public class aggregation32 {
    static void main(String[] args) {
        /*
            Aggregation = Represents a 'has-a' relationship between objects
                One object contains another object as a part of its structure
                but the contained object/s exist independently
         */
        Book b1=new Book("Koi Mil Gaya",182);
        Book b2=new Book("Krrish",212);
        Book b3=new Book("Krrish 2",150);
        Book b4=new Book("Krissh 3",328);
        Book[] books={b1,b2,b3,b4};

        Library lib=new Library("Hrithik Roshan Library",1992,books);
        lib.displayInfo();
    }
}
