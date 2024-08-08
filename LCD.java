// Name: Laith Wajeeh
// Class: CS 145
// Assignment: Lab 6: Recursion - LCD
// Sources: stackexchange.com.
// Purpose: Demonstrates the use of recursion through using it to find the least common denominator.
public class LCD {

    public static void main(String[] args) {
    //runs with ecample values
    System.out.println(lcd(11,5,22,17,1));
    }

    //takes in two fractions as ints and finds their least common denominator and returns it as an int. 
    public static int lcd(int fn, int fd, int sn, int sd, int i) {
        // sees if the first denominator times i devides by the second common denominator evenly.
        if ((fd * i)%sd == 0) {
            return fd * i;
        } else {
        // if not increment i and try again.
            return lcd(fn, fd, sn, sd, i + 1);
        }
    }
}