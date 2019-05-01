package test;

/**
 * Created by Kgrebenyuk on 05.02.2019.
 */

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class gametest {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int tt = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if (count == 0) {
                tt = t;
                if (Math.abs(0 - tt) < Math.abs(0 - t))
                    tt = tt;
                else
                    tt = t;
                count++;
            } else {
                if (Math.abs(0 - tt) < Math.abs(0 - t))
                    tt = tt;
                else if (Math.abs(0 - tt) == Math.abs(0 - t)){
                    if (tt > 0)
                      tt = tt;
                    else if (t > 0)
                        tt = t;
                }
                else
                    tt = t;
            }
        }


        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(tt);
    }
}