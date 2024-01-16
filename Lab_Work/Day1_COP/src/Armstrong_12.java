import java.util.*;

public class Armstrong_12 {

	public static void main(String[] args) {
		
		int c=0, num, k=0, sum=0;
		
		System.out.println("Enter a number= ");
		Scanner sc=new Scanner(System.in);
		
		num = sc.nextInt();
		int temp = num;
		
		do {
			temp = temp/10;
			c++;
		} while(temp != 0);
		
		int arr[] = new int[c];
		
		for(int i=0; i<c;i++ ) {
			arr[i] = num%10;
			num = num/10;	
		}
		
		for(int i=0; i<c; i++) {
			sum += Math.pow(arr[i], 3);
		}
		
		if(sum == temp) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
		
	}

}
