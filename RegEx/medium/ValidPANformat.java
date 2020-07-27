import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // <char><char><char><char><char><digit><digit><digit><digit><char>

    // Template Credit goes to www.hackerrank.com/kogupta
    private static boolean isValidPAN(String s) {
        String pattern = "[A-Z]{5}\\d{4}[A-Z]";
        String id = s;
        if (id.matches(pattern) == true)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(br.readLine());
            for (int j = 0; j < i; j++) {
                String s = br.readLine();
                System.out.println(isValidPAN(s) ? "YES" : "NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}