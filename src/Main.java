/*
Boolean Operators 01
Exercise: Boolean Operators 1
Try to solve on paper the following boolean algebra operations:

[A]: 2 <= 2 && !true
[B]: !false && 3 > 2
[C]: considering that t=false and f=true: !(!t || f)
[D]: 6 > 6 ^ !(true && true)
Then compare your solutions with a Java program that tests the validity of your assumptions.
 */
public class Main {
    public static void main(String[] args) {

        //[A]: 2 <= 2 && !true = false && false = false
        System.out.println("[A]: "+(2 <= 2 && !true));

        //[B]: !false && 3 > 2 = true && true = true
        System.out.println("[B]: "+ (!false && 3 > 2));

        //[C]: considering that t=false and f=true: !(!t || f) = !(true||true) = !(true) = false
        boolean t=false,f=true;
        System.out.println("[C]: considering that t=false and f=true: "+ (!(!t || f)));

        //[D]: 6 > 6 ^ !(true && true) = false ^ !(true) = false ^ false = false
        System.out.println("[D]: "+(6 > 6 ^ !(true && true)));
    }
}
