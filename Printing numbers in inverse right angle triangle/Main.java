import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = n ; i >= 1 ; i--){
          int p=i;
          for(int j=1;j<=i;j++)
          {
             System.out.print(p);
            p--;
            
          }
			System.out.print("\n");	
		}
	}
}