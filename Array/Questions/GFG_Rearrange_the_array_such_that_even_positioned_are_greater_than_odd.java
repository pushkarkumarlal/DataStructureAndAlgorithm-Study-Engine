// # Question Medium Level --> Rearrange the array such that even positioned are greater than odd.
----------------------------------------------------------------------------------------------
// Given an array A of n elements, sort the array according to the following relations :  
// A[i] >= A[i-1] , if i is even,  ∀ 1 <= i < n
// A[i] <= A[i-1] , if i is odd ,  ∀ 1 <= i < n
// Print the resultant array.
//--------------------------------------------------------------------------------------------------
//   Input : A[] = {1, 2, 2, 1}
// Output :  1 2 1 2
// Explanation : 
// For 1st element, 1  1, i = 2 is even.
// 3rd element, 1  1, i = 4 is even.
//----------------------------------------------------------------------------------------------------
// Input : A[] = {1, 3, 2}
// Output : 1 3 2
// Explanation : 
// Here, the array is also sorted as per the conditions. 
// 1  1 and 2 < 3.
// ________________________________________________________________________________

 
  
    //Solution
  // Observe that array consists of [n/2] even positioned elements. 
  // If we assign the largest [n/2] elements to the even positions and the rest of the elements to the odd positions, 
  // our problem is solved. Because element at the odd position will always be less than the element at the even position as 
  // it is the maximum element and vice versa. Sort the array and assign the first [n/2] elements at even positions.



import java.io.*;
import java.util.*;

class Main {
	public static void main(String args[])
	{
		int Arr[] = { 4, 7, 9, 0, 1 };
		
		Arrays.sort(Arr);

		int ans[] = new int[Arr.length];
		
		int p = 0, q = Arr.length - 1;
		
		for (int i = 0; i < Arr.length; i++) {

			// Assign even indexes with maximum elements
			if ((i + 1) % 2 == 0)
				ans[i] = Arr[q--];

			// Assign odd indexes with remaining elements
			else
				ans[i] = Arr[p++];
		}
		for (int i = 0; i < Arr.length; i++)
			System.out.print(ans[i] + " ");
	}
}


