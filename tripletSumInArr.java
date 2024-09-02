//https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int X = Integer.parseInt(inputLine[1]);
            int A[] = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.find3Numbers(A, n, X);
            System.out.println(ans ? 1 : 0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean find3Numbers(int arr[], int n, int x) {
        //Tc: O(n^2) Sc: O(1) 

        // Your code Herem
        int left;
        int right;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++)
        {
            left = i+1;
            right = n-1;
            while(left < right)
            {
            
            if(arr[i] + arr[left] + arr[right] == x) return true;
            else if(arr[i] + arr[left] + arr[right] < x) left++;
            else right--;
            }
        }
        return false;
    }
}
