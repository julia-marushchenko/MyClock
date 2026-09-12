/**
 *  Java program to implement clock.
 */

package com.myclock;

/**
 *  Main class.
 */
public class Main {
    //
    public static void main(String[] args) {

        // Variables of a clock.
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        while (true) {
             // Printing time.
            if (hours < 10) {
                System.out.print("0");
            }

            System.out.print(hours);

            System.out.print(":");

            if(minutes < 10) {
                System.out.print("0");
            }

            System.out.print(minutes);

            System.out.print(":");

            if (seconds <10) {
                System.out.print("0");
            }

            System.out.print(seconds);

            System.out.println();

            // The second's hand progress.
            Thread.sleep(1000);
            seconds = seconds + 1;

            // The other hand's progress when necessary.
            if(seconds > 59) {
                minutes = minutes + 1;
                seconds = 0;

                if (minutes > 59) {
                    hours = hours + 1;
                    minutes = 0;

                    if (hours > 23) {
                        hours = 0;
                    }
                }
            }
        }
    }
}
