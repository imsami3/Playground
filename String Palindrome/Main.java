import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
     String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str); 
      int front = 0;
      int end = str.length()-1;
      int pallindrome=0;
      while(front<=end)
      {
        if(sb.charAt(front)==sb.charAt(end))
        {
           front++;
          end--;
          pallindrome= 1;
        }
        else
        {
          pallindrome =0;
          break;
        }
        
      }
        if(pallindrome==1)
          System.out.print("Yes");
      else
        System.out.print("No");
      }
    } 