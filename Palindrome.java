import java.util.*;

class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int rev = 0;
		int rem;

		System.out.println("Enter 4 digit number : ");
			int n = sc.nextInt();

		int i = n;

		while(i!=0)
		{
			rem = i%10;

			rev = rev*10+rem;
			
			i=i/10;
		}
		
			if(n==rev)
				System.out.println("Number is Palindrome");
			else
				System.out.println("Number is not Palindrome");
	}
}