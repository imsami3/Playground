import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[]= new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i] = in.nextInt();
      }
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int p=0,q=0;
      for(int i=0;i<=n-1;i++)
      {
        if(arr[i]==n1)
        {
          System.out.println(i);
           p=1;
        }
        else if(arr[i]==n2)
        {
          System.out.println(i);
           q=1;
        }
      }
      if(!(p==1&&q==1))
          System.out.println("-1");
    }
}