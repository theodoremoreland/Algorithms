import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final Pattern p = Pattern.compile("^(\\d{1,3})[\\- ](\\d{1,3})[\\- ](\\d{4,10}$)");

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        final int phoneNumberCount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < phoneNumberCount; i++) {
            String phoneNumber = scan.nextLine();
            Matcher m = p.matcher(phoneNumber);

            if (m.find()) {
                String cc = m.group(1);
                String ac = m.group(2);
                String nb = m.group(3);
                System.out.printf("CountryCode=%s,LocalAreaCode=%s,Number=%s%n", cc, ac, nb);
            }
        }
    }
}