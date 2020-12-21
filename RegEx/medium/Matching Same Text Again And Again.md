<pre><code>
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker(
"([a-z])([\\w])([\\s])([^\\w])([\\d])([^\\d])([A-Z])([a-zA-Z])([AEIOUaeiou])([^\\s])\\1\\2\\3\\4\\5\\6\\7\\8\\9\\10"); // Use
                                                                                                                        // \\
                                                                                                                        // instead
                                                                                                                        // of
                                                                                                                        // using
                                                                                                                        // \

    }
}

class Regex_Test {

    public void checker(String Regex_Pattern) {

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}
</code></pre>