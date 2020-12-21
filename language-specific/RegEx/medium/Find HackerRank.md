<pre><code>
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // Print 1 if the conversation starts with hackerrank
    // Print 2 if the conversation ends with hackerrank
    // Print 0 if the conversation starts and ends with hackerrank
    // Print -1 if none of the above.
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        String pattern1 = "^(hackerrank).*$";
        String pattern2 = "^.*(hackerrank)$";
        final int Convos = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < Convos; i++) {
            String convo = scan.nextLine();
            // System.out.println(convo);
            if (convo.matches(pattern1) && convo.matches(pattern2)) {
                System.out.println("0");
            } else if (convo.matches(pattern1))
                System.out.println("1");
            else if (convo.matches(pattern2))
                System.out.println("2");
            else
                System.out.println("-1");
        }
    }
}
</code></pre>