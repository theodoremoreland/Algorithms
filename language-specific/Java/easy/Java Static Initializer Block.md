Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.

If B <= 0 or  H <=0, the output should be:
<pre>java.lang.Exception: Breadth and height must be positive</pre>

Input Format
There are two lines of input. The first line contains B:  
the breadth of the parallelogram. The next line contains H:  
the height of the parallelogram.

Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1
<pre>
1
3
</pre>

Sample output 1
<pre>
3
</pre>

Sample input 2
<pre>
-1
2
</pre>

Sample output 2
<pre>
java.lang.Exception: Breadth and height must be positive
</pre>

<pre><code>
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int B;
    static int H;
    static boolean flag;
    static {

        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }

}
</code></pre>