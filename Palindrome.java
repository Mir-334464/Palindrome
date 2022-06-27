import java.util.*;

class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int rev = 0;
		int rem;

		System.out.print("\n\t\t\tEnter number : ");
			int n = sc.nextInt();
		
		System.out.println("\n\t\t\t===================");
		int i = n;

		while(i!=0)
		{
			rem = i%10;

			rev = rev*10+rem;
			
			i=i/10;
		}
		
			if(n==rev)
				System.out.println("\n\t\t\tNumber is Palindrome");
			else
				System.out.println("\n\t\t\tNumber is not Palindrome");
	}
}
