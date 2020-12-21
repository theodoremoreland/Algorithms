<pre><code>
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final PrintStream out = System.out;

    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);
        final int lines = Integer.parseInt(scan.nextLine());
        final Pattern p = Pattern.compile("\\b((https?://ww[w2]\\.)|(https?://))(([a-z\\d\\-]+\\.)+([a-z\\d]+))");

        List<String> arr = new ArrayList<String>();

        for (int i = 0; i < lines; i++) {
            String elem = scan.nextLine();
            Matcher m = p.matcher(elem);

            while (m.find()) {

                String domain = m.group(4);

                if (!arr.contains(domain) && domain != null) {
                    // System.out.println(domain);
                    arr.add(domain);
                }
            }

        }

        Collections.sort(arr);
        String results = "";

        for (String i : arr) {
            results += i + ";";
        }

        out.println(results.substring(0, results.length() - 1));
    }
}
</code></pre>