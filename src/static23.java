public class static23 {
//    static = makes a variable or method belong to the class rather than specific object
//    commonly used for utility methods or shared resources
//    Ex - Math.round() -> round is a static method
    static void main(String[] args) {
        Friend frd1=new Friend("Spongebob");
        Friend frd2=new Friend("Patrick");
        System.out.println(frd1.numOfFriends);
        frd1.addFriend();
        System.out.println(frd2.numOfFriends);
        

    }

}
