import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// For a valid (latitude, longitude) pair:
// -90<=X<=+90 and -180<=Y<=180.
// They will not contain any symbols for degrees or radians or N/S/E/W. There may or may not be a +/- sign preceding X or Y.
// There will be a space between Y and the comma before it.
// There will be no space between X and the preceding left-bracket, or between Y and the following right-bracket.
// There will be no unnecessary zeros (0) before X or Y.

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String pattern = "\\([\\-+]?([1-8]?[0-9](\\.\\d+)?|90(\\.0+)?),\\s[\\-+]?([0-9]?[0-9](\\.\\d+)?|1[0-7][0-9](\\.\\d+)?|180(\\.0+)?)\\)";
        int pairs = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < pairs; i++) {
            String XY = scan.nextLine();
            // System.out.println(id);
            if (XY.matches(pattern) == true)
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
}