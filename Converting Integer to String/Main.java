import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
     int temp=n;
    int count =0;
      
    if(n<0)
      n = n*-1;
     while(n>0)
    {
      count++;
      n=n/10;
    }
    
    if(temp<0)
    {
      
      count = count +1;
      
    } 
 char str[] = new char[count];
    if(temp<0)
    {
      temp=temp*-1;
      str[0] ='-';
    }
    count = count-1;
    while(temp>0)
    {
      char ch = (char)((temp%10)+'0');
      str[count] = ch;
      count --;
      temp/=10;
    }
  
    System.out.print(str);
 
  }
}