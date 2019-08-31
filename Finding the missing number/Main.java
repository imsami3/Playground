import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
       int a[] = new int[10];
      for(int i=0;i<n;i++)
        arr[i]= in.nextInt();
      for(int i=0;i<n;i++)
      {
        a[arr[i]]++;
      }
      for(int i=0;i<n;i++)
      {
        if(a[i]==0)
          System.out.print(i);
      }
    }
}