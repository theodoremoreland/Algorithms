You are given a 6*6 2D array. An hourglass in an array is a portion shaped like this:
<pre>
a b c
  d
e f g
</pre>

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
<pre>
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
</pre>

Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
<pre>
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
</pre>

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format:  
There will be exactly 6 lines, each containing 6 integers seperated by spaces. Each integer will be between -9 and 9 inclusive.

Output Format
<pre>
Print the answer to this problem on a single line.
</pre>

Sample Input
<pre>
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
</pre>

Sample Output
<pre>
19
</pre>

<pre><code>
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int max = 0;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {

                // top cells
                int a = arr[row][col];
                int b = arr[row][col + 1];
                int c = arr[row][col + 2];

                // middle cell
                int d = arr[row + 1][col + 1];

                // bottom cells
                int e = arr[row + 2][col];
                int f = arr[row + 2][col + 1];
                int g = arr[row + 2][col + 2];

                // System.out.printf("%d %d %d %n %d %n%d %d %d%n", a,b,c,d,e,f,g);

                int sum = a + b + c + d + e + f + g;

                // Reassigns max to initial hourglass
                if (row == 0 && col == 0)
                    max = sum;
                else if (sum > max)
                    max = sum;
                else
                    continue;
            }

        }

        System.out.println(max);

    }
}
</code></pre>