import java.util.*;

class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int len = str.length();
    int flag=0;
    double bd=0,ad=0;
    for(int i=0;i<len;i++)
    {
      if(str.charAt(i)=='.')
        flag=1;
    }
    if(flag==1)
    {
      for(int i=len-1;str.charAt(i)!='.'&&i>0;i--)
      {
        ad = (ad/10)+(str.charAt(i)-'0');
      }
      
      ad= ad/10;
      
      for(int i=0;str.charAt(i)!='.';i++)
      {
        bd = (bd*10)+(str.charAt(i)-'0');
      }
    }
    else
    {
       for(int i=0;i<len;i++)
      {
        bd = (bd*10)+(str.charAt(i)-'0');
      }
    }
    double sum = bd+ad;
    
    System.out.printf("%.6f",sum);
  }
}