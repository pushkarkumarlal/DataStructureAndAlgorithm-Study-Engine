// Question Link - https://leetcode.com/problems/single-number/description/?envType=featured-list&envId=top-interview-questions
// Awesome Solution - > https://leetcode.com/problems/single-number/solutions/3021354/java-easy-solution-beats-100-runtime-1ms-bit-manipulation/?envType=featured-list&envId=top-interview-questions

class Solution {
    public int singleNumber(int[] nums) {
        
        int unique=0;
        for(int i=0;i<nums.length;i++){
            unique ^=nums[i];
        }
        return unique;
    }
}
