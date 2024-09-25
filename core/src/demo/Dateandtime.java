package demo;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result
 {
             

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year)
     {
          String s="";
        if(year>2000&&year<3000)
        {
            int y=year-2000;
            int calc=day+(int)(month/4)+y+(int)(47/4);
            switch(calc)
            {
                 case 1:
                    s="MONDAY";
                    break;
                 case 2:
                    s="TUESDAY";
                    break;
                case 3:
                   s="WEDNESDAY";
                   break;
                case 4:
                   s="THURSDAY";
                   break;
                case 5:
                   s="FRIDAY";
                   break;
                 case 6:
                   s="SATURDAY";
                   break;
                 case 7:
                   s="SUNDAY";
                   break;
            }
        }
        return s;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
