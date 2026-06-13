public class Book {
    String title;
    int pages;
    Book(String title, int pages){
        this.title=title;
        this.pages=pages;
    }
    void displayInfo(){
        System.out.println(title+ " - "+pages+ " pages" );
    }
}
