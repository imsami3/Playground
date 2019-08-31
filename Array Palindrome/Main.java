import java.util.Scanner;
class Main 
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
       
       int left = 0;
       int right = arr_size-1;
       int ispallindrome = 0;
       while(left <= right)
       {
          ispallindrome=0;
          if(arr[left]==arr[right])
          {
             right--;
            left++;
            ispallindrome=1;
          }
          else 
          {
             System.out.println("No");
             break;
          }
       }
     if(ispallindrome==1)
       System.out.print("Yes");
   }
}