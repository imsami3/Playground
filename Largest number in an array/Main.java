import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
int n = in.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++)
arr[i] = in.nextInt();

int l=0;
for(int i=0;i<n;i++)
{
   if(arr[i]>l)
   l=arr[i];
}

System.out.print(l);

    }
}