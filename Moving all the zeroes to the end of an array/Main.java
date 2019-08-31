import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int arr[]= new int[n];
      for(int i=0;i<n;i++)
        arr[i]= in.nextInt();
      int a[]=new int[n];
      int index=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]!=0)
        {
          a[index]=arr[i];
        index++;
        }
      }
      for(int i=index;i<n;i++)
        a[i]=0;
      
      for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}