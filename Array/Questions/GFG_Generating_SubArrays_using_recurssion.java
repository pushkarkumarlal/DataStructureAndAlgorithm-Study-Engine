/*
# Generating subarrays using recursion
Given an array, generate all the possible subarrays of the given array using recursion.
Examples: 

Input : [1, 2, 3]
Output : [1], [1, 2], [2], [1, 2, 3], [2, 3], [3]

Input : [1, 2]
Output : [1], [1, 2], [2]

note:-  In general, for an array/string of size n, there are n*(n+1)/2 non-empty subarrays/substrings.
*/

// Approach: We use two pointers start and end to maintain the starting and ending point of the array and follow the steps given below: 

// * Stop if we have reached the end of the array
// * Increment the end index if the start has become greater than end
// * Print the subarray from index start to end and increment the starting index








//Solution in Iterative Way
// Finding the subarray in an iterative way

// public class Main
// {
// 	public static void main(String[] args) {
// 	int arr[]={1,2,3,4};
// 	//int arr2[]=new int[arr.length*(arr.length+1)/2];


//    // Pick starting point
// 	for(int i=0;i<arr.length;i++){
//     //picking the Ending Point
// 	    for(int j=i;j<arr.length;j++){
//         //Printing the Elements between The Ending and the starting point
// 	        for(int k=i;k<=j;k++){
// 	            System.out.print(arr[k]+" ");
// 	        }
// 	        System.out.print("|");
// 	    }
// 	    System.out.println(",");
// 	}
	
	
// 	}
// }

