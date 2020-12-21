import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < N; i++) {
            String address = scan.nextLine();
            String IPv4 = "^([1-9][0-9]?|1[0-9][0-9]|2[0-5][0-5])\\.([1-9][0-9]?|1[0-9][0-9]|2[0-5][0-5])\\.([1-9][0-9]?|1[0-9][0-9]|2[0-5][0-5])\\.([1-9][0-9]?|1[0-9][0-9]|2[0-5][0-5])$";
            String IPv6 = "[0-9A-Fa-f]{1,4}:[0-9A-Fa-f]{1,4}:[0-9A-Fa-f]{1,4}:[0-9A-Fa-f]{1,4}:[0-9A-Fa-f]{1,4}:[0-9A-Fa-f]{1,4}:[0-9A-Fa-f]{1,4}:[0-9A-Fa-f]{1,4}";
            if (address.matches(IPv4))
                System.out.println("IPv4");
            else if (address.matches(IPv6))
                System.out.println("IPv6");
            else
                System.out.println("Neither");
        }
    }
}
