package main.java.com.core.test.main;

/*package whatever //do not write package name here */



import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.IntStream;
import java.util.stream.*;

class GFG {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // enter cases
        int totalCases = input.nextInt();

        while(totalCases-- > 0){
            int n = input.nextInt();

            int[] arr = new int[n];
            IntStream.range(0, n).forEach(i->{
                arr[i] = input.nextInt();
            });

            StringBuilder sb = maxOfAllSubArray(arr, n);
            System.out.println(sb);
        }


    }

    public static StringBuilder maxOfAllSubArray(int[] arr, int n){
	    /*int[] arrC = new int[n];

	    for(int i=0;i<n;i++)
	        arrC[i] = arr[i];*/

        StringBuilder sb = new StringBuilder();

        List<Integer> list = new ArrayList<>();

        for(int j=0; j < n-2;j++){
            int max = arr[j];
            for(int k= j+1; k < j+3;k++){
                if(arr[k] > max)
                    max = arr[k];
            }
            list.add(max);
        }

        for(int val : list)
            sb.append(val).append(" ");

        return sb;
    }
}

