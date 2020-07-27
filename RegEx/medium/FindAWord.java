import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);
        final int sentenceCount = Integer.parseInt(scan.nextLine());
        String sentence = "";

        for (int i = 0; i < sentenceCount; i++) {
            sentence += scan.nextLine() + "\n";
        }

        final int queryCount = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < queryCount; i++) {
            String q = scan.nextLine();
            Pattern p = Pattern.compile("\\b" + q + "\\b");
            Matcher m = p.matcher(sentence);
            int occurrences = 0;
            while (m.find()) {
                occurrences++;
            }
            System.out.println(occurrences);
        }

    }
}