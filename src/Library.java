public class Library {
    String name;
    int year;
    Book[] books;
    Library(String name, int year, Book[]books){
        this.name=name;
        this.year=year;
        this.books=books;
    }
    void displayInfo(){
        System.out.println(name+" Estd."+year);
        System.out.println("Book List:");
        for(Book b:books){
            b.displayInfo();
        }
    }
}
