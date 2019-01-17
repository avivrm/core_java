package com.core.test.main;

public class IncerasingSubArray {

	
	public static void main(String... string){
		int[] arr = new int[]{1,0,2,2,4,1,2,3,4};
		System.out.println("Incearsing subarray are :"+countIncreasing(arr,9));
	}
	
	static int countIncreasing(int arr[], int n)
	{
	    int cnt = 0;  // Initialize result
	 
	    // Initialize length of current increasing
	    // subarray
	    int len = 1;
	 
	    // Traverse through the array
	    for (int i=0; i < n-1; i++)
	    {
	        // If arr[i+1] is greater than arr[i],
	        // then increment length
	        if (arr[i + 1] > arr[i])
	            len++;
	             
	        // Else Update count and reset length
	        else
	        {
	            cnt += (((len - 1) * len) / 2);
	            len = 1;
	        }
	    }
	     
	    // If last length is more than 1
	    if (len > 1)
	        cnt += (((len - 1) * len) / 2);
	 
	    return cnt;
	}
}
