import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);
        final int LineCount = Integer.parseInt(scan.nextLine());
        String INPUT = "";
        for (int i = 0; i < LineCount; i++) {
            INPUT += scan.nextLine() + "\n";
        }

        final int QueryCount = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < QueryCount; i++) {
            String q = scan.nextLine();
            String REGEX = "\\w(" + q + ")\\w";
            Pattern pattern = Pattern.compile(REGEX);
            Matcher match = pattern.matcher(INPUT);

            int count = 0;

            while (match.find()) {
                count++;
                // System.out.println(match);
                // System.out.println("Match number "+count);
                // System.out.println("start(): "+match.start());
                // System.out.println("end(): "+match.end());
            }
            System.out.println(count);
        }

    }
}