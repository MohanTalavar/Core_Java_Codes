import java.util.Scanner;

public class Q12_Armstrong {

	public static void main(String[] args) {
		
		int num,k=0, i=0, sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number= ");
		
		num= sc.nextInt();
		
		do {
			num= num/10;
			k++;
			
		}while(num != 0);
		
		int arr[] = new int[k];
		do
		{	arr[i]= num%10;
			num= num/10;
			k++;
		}while(num!=0);
		
		for(i=0; i<k; i++)
		{
			sum+= arr[i]*arr[i]*arr[i];
		}
		
		if(sum-num==0)
			System.out.println("Armstrong Number");
		else System.out.println("Not an Armstrong Number");
		
	}

}
