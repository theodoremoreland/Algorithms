import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final int lines = Integer.parseInt(scan.nextLine());
        final Pattern p = Pattern.compile("(?<=(<a href=\"))(.+?)(?=(\")).*?>\\s*(<\\w+>)*(.{0,80}?)</");
        for (int i = 0; i < lines; i++) {
            String html = scan.nextLine();
            Matcher m = p.matcher(html);
            while (m.find()) {
                String link = m.group(2);
                String text = m.group(5);
                System.out.printf("%s,%s%n", link, text);
            }
        }
    }
}
