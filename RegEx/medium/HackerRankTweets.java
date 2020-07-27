import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final PrintStream out = System.out;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String REGEX = ".*?\\b[Hh][Aa][Cc][Kk][Ee][Rr][Rr][Aa][Nn][Kk]\\b.*";
        final int numOfTweets = Integer.parseInt(scan.nextLine());
        int mentions = 0;
        for (int i = 0; i < numOfTweets; i++) {
            String tweet = scan.nextLine();
            if (tweet.matches(REGEX))
                mentions++;

        }
        out.println(mentions);
    }
}
