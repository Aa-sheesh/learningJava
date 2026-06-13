public class printf7 {
    static void main(String[] args) {
        /*
            # printf = method to format a string
            %[flag][width].[precision][specifier-character]
            # flags
                '+'= output a plus
                ',' = comma grouping separator
                '(' = negative numbers enclosed in ()
                'space' = display - if negative and space if positive

            # width = How many digits do you want the number to be padded with
                0 = 0 padding
                +ve number = right - justified padding
                -ve number = left - justified padding

            # specifier characters
                s = string
                c = char
                d = int
                f = float
                b = boolean
         */

        int n1=1,n2=-1;
        double f1=2.000;
        double f2=-2.000;
        int n3=100000;
        String name="Aashish";
        System.out.printf("%+d\n",n1);
        System.out.printf("% d\n",n2);
        System.out.printf("%(d\n",n2);
        System.out.printf("%,d\n",n3);
        System.out.printf("%(d\n",n3);
        System.out.printf("%04d\n",n2);
        System.out.printf("%4d\n",n2);
        System.out.printf("%.2f\n",f1);
        System.out.printf("%f\n",f2);
        System.out.printf("% 05.2f\n",f2);
        System.out.printf("%s\n",name);
    }
}
