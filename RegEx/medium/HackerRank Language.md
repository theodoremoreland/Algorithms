import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        final String pattern = "[1-9]\\d{4,5}\\s(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)";
        final int N = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < N; i++) {
            String api_id = scan.nextLine();
            // System.out.println(id);
            if (api_id.matches(pattern) == true)
                System.out.println("VALID");
            else
                System.out.println("INVALID");
        }
    }
}