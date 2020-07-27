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
        final Pattern p = Pattern.compile("[\\.\\n]*?\\b([\\w.]+@[\\w.]+\\w+)\\b[\\.\\n]*");

        List<String> arr = new ArrayList<String>();

        for (int i = 0; i < lines; i++) {
            String tweet = scan.nextLine();
            Matcher m = p.matcher(tweet);

            while (m.find()) {
                String email = m.group(1);
                // System.out.println(email);
                if (!arr.contains(email))
                    arr.add(email);
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