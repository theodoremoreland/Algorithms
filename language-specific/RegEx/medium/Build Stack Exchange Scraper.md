<pre><code>
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);
        final Pattern id = Pattern.compile("href=\"/questions/(\\d+)/");
        final Pattern q = Pattern.compile("class=\"question-hyperlink\">(.+?)<");
        final Pattern t = Pattern.compile("class=\"relativetime\">(.+?)<");
        String fragment = "";

        while (scan.hasNextLine()) {
            fragment += scan.nextLine() + "\n";
        }

        // System.out.println(fragment);

        Matcher ids = id.matcher(fragment);
        Matcher questions = q.matcher(fragment);
        Matcher times = t.matcher(fragment);

        while (ids.find() && questions.find() && times.find()) {
            for (int j = 0; j < times.groupCount(); j++) {
                String identifier = ids.group(1);
                String question = questions.group(1);
                String time = times.group(1);
                System.out.printf("%s;%s;%s%n", identifier, question, time);
            }
        }
    }
}
</code></pre>