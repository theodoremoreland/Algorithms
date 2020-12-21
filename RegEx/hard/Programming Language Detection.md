<pre><code>
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    private static final Pattern mLine = Pattern.compile("(\\/\\/.*?(?=(\\n)))|\\/\\*\\*?(.|\n)*?\\*?\\*\\/");

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String javaImports = "[^\"]?\\s*import java.*?;";
        String cImports = "[^\"]?\\s*#include<.*?>";
        String pythonImports = "[^\"]?\\s*import \\w+";

        String javaStdIn = "[^\"]\\s*new\\s*?Scanner\\s*?(System.in)\\s*?;";
        String cStdIn = "[^\"]\\s*scanf(.*?);";
        String pythonStdIn = "[^\"].*?sys.stdin:$|[^\"].*?input(.*?)$";

        String javaStdOut = "[^\"]\\s*System.out.print.*?;";
        String cStdOut = "[^\"]\\s*printf(.*?);";
        String pythonStdOut = "[^\"]\\s*print[^f]";

        String javaKeywords = "[^\"]\\s*(public|private|protected|final).*?;";
        String cKeywords = "[^\"]\\s*\\w+(->|int \\*)\\w+?;";
        String pythonKeywords = "[^\"]def\\s*\\w+(.*?)\\s*:$";

        List<String> Java = Arrays.asList(javaImports, javaStdIn, javaStdOut, javaKeywords);
        List<String> C = Arrays.asList(cImports, cStdIn, cStdOut, cKeywords);
        List<String> Python = Arrays.asList(pythonImports, pythonStdIn, pythonStdOut, pythonKeywords);

        String code = "";
        while (scan.hasNext()) {
            code += scan.nextLine() + "\n";
            for (String regex : Java) {
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(code);
                while (m.find()) {
                    // System.out.println(regex + ": " + m.group());
                    System.out.println("Java");
                    return;
                }
            }
            for (String regex : C) {
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(code);
                while (m.find()) {
                    // System.out.println(regex + ": " + m.group());
                    System.out.println("C");
                    return;
                }
            }
            for (String regex : Python) {
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(code);
                while (m.find()) {
                    // System.out.println(regex + ": " + m.group());
                    System.out.println("Python");
                    return;
                }
            }
        }
    }
}
</code></pre>