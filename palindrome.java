import java.util.Scanner;
import java.util.*;

public class palindrome {

		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int a=in.nextInt();
			int input=a;
			int mod=0;
			while(input>0)
			{
				int rem=a%10;
				mod=mod+rem;
				input=input/10;
			}
			System.out.println(mod);
			int newinput=mod;
			while(newinput>0)
			{ int rem=0;
				int palrem=a%10;
				mod=mod*rem;
				newinput=mod/10;
			}
			System.out.println(newinput);
			if(newinput==a)
			{
				System.out.println("it is palindrome");
			}
			else
			{
				System.out.println("it is not a palindrome");
			}
		}
			
		
	}
