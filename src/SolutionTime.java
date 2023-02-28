import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here


        int x=s.length()-1;
        int m=0,n;
        int sum=0;
        String q;
        int r;
        String time ="";
        String ss[]=s.split(":",x);
        for( String i : ss)
            // System.out.println(i);

            //
            m= Integer.parseInt(ss[0]);
        n= Integer.parseInt(ss[1]);
        // System.out.println("m="+m);
        // System.out.println("n="+n);
        String a;
        String b;
        String c;
        a=ss[2];
        //System.out.println("a="+a);
        b=a.substring(0,2);
        c=a.substring(2);
        System.out.println("C="+c);

        if(m!=12 && m >6)
        {
            System.out.println("m!=12 && m >6");

            sum=m+12;
            time= sum+":"+ss[1]+":"+b;

        }
        if(!c.equals("PM") && m==12 )
        {
            System.out.println("m==12 & c!=PM");
            time= "00"+":"+ss[1]+":"+b;
        }
        if(m==12 && c.equals("PM") )
        {
            System.out.println("m==12 && c==PM");
            time= "12"+":"+ss[1]+":"+b;
        }
        if(m<=6 && !c.equals("PM"))
        {
            System.out.println("(m<=6)");
            String p=Integer.toString(m);

            time= "0"+p+":"+ss[1]+":"+b;
        }
        if(m<=6 && c.equals("PM"))
        {
            System.out.println("(m<=6)");
            String p=Integer.toString(m);
            sum=m+12;
            time= sum+":"+ss[1]+":"+b;
        }
        return time;
    }

}




public class SolutionTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

   // Interface Collection
}
