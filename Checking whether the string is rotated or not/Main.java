import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
      String str2 = in.nextLine();
      str1 = str1.concat(str1);
      int correct=1;
      for(int i=0;i<(str1.length()-str2.length()+1);i++)
      {
        correct=1;
        for(int j=0;j<str2.length();j++)
        {
          if(str1.charAt(i+j)!=str2.charAt(j))
          {
            correct=0;
          }
        }
          if(correct==1)
          {
            System.out.print("Yes");
            break;
          }
        
        }
        if(correct==0)
        {
           System.out.print("No");
        }
      }
    }
