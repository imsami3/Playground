import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String num = br.readLine();
        String str[]= num.split(",");
        Set <String> lhs = new LinkedHashSet<String>(Arrays.asList(str));
        //lhs = Sets.asList(str);
        System.out.println(lhs);
    }
}
