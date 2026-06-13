public class subStrings9 {

    static void main(String[] args) {

        /*
            .substring(beginning,end) = beginning to end -1 displayed
         */

        String email="aashishs4912345@gmail.com";
        System.out.println("Username="+email.substring(0,email.indexOf("@")));
        System.out.println("Domain=" +email.substring(email.indexOf("@")+1));
    }

}
