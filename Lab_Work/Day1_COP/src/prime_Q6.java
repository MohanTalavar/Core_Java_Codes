import java.util.Scanner;
public class prime_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int i,n,count = 0;
		
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (i = 1; i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println("It's a Prime Number");
		else 
			System.out.println("Not Prime Number");
		
		
		
	}

}
