// The Calendar class is an abstract class that provides methods for converting
// between a specific instant in time and a set of calendar fields such as YEAR,
// MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar
// fields, such as getting the date of the next week.

// You are given a date. You just need to write the method, getDay, which
// returns the day on that date. To simplify your task, we have provided a
// portion of the code in the editor.

// Input Format
// A single line of input containing the space separated month, day and year,
// respectively, in MM DD YYYY format.

// Output Format
// Output the correct day in capital letters.

// Sample Input
// 08 05 2015

// Sample Output
// WEDNESDAY

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING. The function accepts following
     * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        Calendar c = Calendar.getInstance();

        c.set(year, month - 1, day); // month starts at zero

        int weekday = c.get(Calendar.DAY_OF_WEEK) - 1; // day of week starts at zero

        String[] days = { "SUNDAY", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        return days[weekday].toUpperCase();
    }

}