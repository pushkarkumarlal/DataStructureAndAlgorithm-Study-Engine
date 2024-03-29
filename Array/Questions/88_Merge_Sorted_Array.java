
#Question Link-https://leetcode.com/problems/merge-sorted-array/description/?envType=featured-list&envId=top-interview-questions

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
       
//        for(int i=m,j=0;i<m+n;i++,j++){
//            nums1[i]=nums2[j];
//        }
//        Arrays.sort(nums1);
         
//     }
// }
  
//Also you can solve this way

  
class Solution {
public:
 void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
     int i = m - 1, j = n - 1, k = m + n - 1;
     while(i >= 0 and j >= 0) {
         if(nums1[i] < nums2[j]) {
             nums1[k--] = nums2[j--];
         } else {
             nums1[k--] = nums1[i--];
         }
     }
     while(j >= 0) {
         nums1[k--] = nums2[j--];
     }
 }
};
