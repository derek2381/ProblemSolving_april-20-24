// problem link
// https://www.codechef.com/problems/AVG

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int v = sc.nextInt();
		    int[] arr = new int[n];
		    int total = 0;

		    for(int i = 0;i < n;i++){
		        arr[i] = sc.nextInt();
		        total += arr[i];
		    }

		    int x = ((n+k) * v) - total;

		    if(x <= 0){
		        System.out.println("-1");
		    }else{
		        if(x%k == 0){
		            System.out.println(x / k);
		        }else{
		            System.out.println("-1");
		        }
		    }
		}

	}
}
