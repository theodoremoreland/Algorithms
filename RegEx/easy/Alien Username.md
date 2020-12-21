<pre><code>
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pattern = "^[_.]\\d+[A-Za-z]*(_?)$";
        int usernameCount = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < usernameCount; i++) {
            String username = scan.nextLine();
            if (username.matches(pattern) == true)
                System.out.println("VALID");
            else
                System.out.println("INVALID");
        }
    }
}
</code></pre>