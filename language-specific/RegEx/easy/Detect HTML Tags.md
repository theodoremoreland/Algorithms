<pre><code>
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);
        final int lineCount = Integer.parseInt(scan.nextLine());
        List<String> arr = new ArrayList<String>();

        for (int i = 0; i < lineCount; i++) {
            String line = scan.nextLine();
            Pattern p = Pattern.compile("<\\b(\\w+)\\b.*?>");
            Matcher m = p.matcher(line);

            while (m.find()) {
                String tag = m.group(1);
                // System.out.println(tag);
                if (!arr.contains(tag))
                    arr.add(tag);
            }
        }

        Collections.sort(arr);
        String results = "";

        for (String i : arr) {
            results += i + ";";
        }

        System.out.println(results.substring(0, results.length() - 1));

    }
}
</code></pre>