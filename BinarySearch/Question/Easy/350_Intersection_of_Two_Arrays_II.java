// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]

Question Link- https://leetcode.com/problems/intersection-of-two-arrays-ii/description/?envType=featured-list&envId=top-interview-questions

// The solution below is in two pointer approach not on binary tree appraoch

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n=nums1.length,m=nums2.length;
        int i=0,j=0;

        List<Integer> list=new ArrayList<>();

        while(i<n && j<m){
            int a=nums1[i],b=nums2[j];
            if(a==b){
                list.add(a);
                i++;
                j++;
            }else if(a<b){
                i++;
            }else{
                j++;

            }
        }
        int[] ret=new int[list.size()];

        for(int k=0;k<list.size();k++) ret[k]=list.get(k);

        return ret;
        
    }
}
