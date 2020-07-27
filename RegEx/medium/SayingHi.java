import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        String pattern = "^[Hh][Ii]\\s[^Dd].*$";
        int greetingsCount = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < greetingsCount; i++) {
            String greeting = scan.nextLine();
            // System.out.println(id);
            if (greeting.matches(pattern) == true)
                System.out.println(greeting);
        }
    }
}