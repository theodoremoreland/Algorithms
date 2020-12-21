<pre><code>
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
            if (q.matches("\\w+(our)\\w*")) {
                q = q.replace("our", "(our|or)");
            } else {
                q = q.replace("or", "(our|or)");
            }
            String REGEX = "\\b" + q + "\\b";
            // System.out.println(REGEX + " : " + q);
            Pattern pattern = Pattern.compile(REGEX);
            Matcher match = pattern.matcher(INPUT);

            int count = 0;

            while (match.find()) {
                count++;
            }
            System.out.println(count);
        }

    }
}
</code></pre>