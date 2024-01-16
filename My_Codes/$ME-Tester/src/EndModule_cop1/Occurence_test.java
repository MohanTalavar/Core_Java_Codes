package EndModule_cop1;

import java.util.Arrays;

public class Occurence_test {

	public static void main(String[] args) {
		
		int arr1[] = {0,0,0,0,1};
		int arr2[] = arr1;
		int store[] = new int[arr1.length];
		Arrays.fill(store,0);
		
		int count = 0, index = 0;
		boolean searchFound = false;
		
		for( int i=0; i<arr1.length; i++)
		{
			//checking for already searched elem
			searchFound = false;
			for(int k=0; k<arr1.length; k++)
			{
				if(arr1[i]==store[k])
				{
					searchFound = true ;
					break;
				}	
			}// for
			
			if(!searchFound) {
				store[index]=arr1[i];
				index++;
				
				count=0;
				// Checking the occurrence and count
				for(int j= 0 ; j<arr1.length; j++)
				{
					
					if (arr1[i]==arr2[j])
					{
						count++;
						
					}
				}//inner for
				
				System.out.println("Occurrence of elem "+arr1[i]+ " in array:" + count);
			}
			
		}//outer for

	}

}
