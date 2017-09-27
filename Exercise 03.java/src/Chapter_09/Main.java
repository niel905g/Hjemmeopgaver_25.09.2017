package Chapter_09;

/**
 * Chapter 9 Exercise 3:
 *
 *      (Use the Date class)
 *      Write a program that creates a Date object, sets its elapsed
 *      time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000,
 *      and 100000000000, and displays the date and time using the toString() method,
 *      respectively.
 *
 * Niels Bo Dissing, 27.09.2017.
 */

public class Main {

    public static void main(String[] args) {

        long time = 10000;
        for (int i = 0; i < 8; i++, time *= 10) {

            java.util.Date date = new java.util.Date(time);

        //Displays the dates and times of all 8 options
        System.out.println(date.toString());
        }
    }
}
