import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    private static final Pattern sLine = Pattern.compile("(?<=(\\/\\/)).*?(?=(\\n))");
    private static final Pattern mLine = Pattern.compile("(\\/\\/.*?(?=(\\n)))|\\/\\*\\*?(.|\n)*?\\*?\\*\\/");

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String regex = "(?<=(\\n))\\s+";
        String code = "";
        while (scan.hasNext()) {
            code += scan.nextLine() + "\n";
        }

        Matcher comments = mLine.matcher(code);
        while (comments.find()) {
            String line = comments.group(0).replaceAll(regex, "");
            System.out.println(line);
        }
    }
}
