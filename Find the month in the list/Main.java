import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // System.out.println(str);
        String result = br.readLine();
        String str1[] = str.split(","); 
        List<String> nlist= new ArrayList<String>();
        nlist = Arrays.asList(str1);
        System.out.println(nlist);
        System.out.println("Size of the linked list: "+nlist.size());
        System.out.println("Is LinkedList empty? "+nlist.isEmpty());
        System.out.println("Does LinkedList contains "+result+"?");
        System.out.println(nlist.contains(result));
    }
}