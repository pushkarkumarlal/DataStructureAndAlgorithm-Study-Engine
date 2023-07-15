// Question Link - https://leetcode.com/problems/single-number/description/?envType=featured-list&envId=top-interview-questions
// Awesome Solution - > https://leetcode.com/problems/single-number/solutions/3021354/java-easy-solution-beats-100-runtime-1ms-bit-manipulation/?envType=featured-list&envId=top-interview-questions


// Approach--------------------------------

// Using Bit Manipulation -

// As we know XOR operation with 0 gives the same number
// i.e, a XOR 0 = a
// eg, for decimal no. 2=> 2 XOR 0 = 2
// in binary, 010 XOR 000 = 010

// Also we know that , XOR operation with same number gives 0
// i.e, a XOR a = 0
// eg, 2 XOR 2 = 0
// in binary, 010 XOR 010 = 000

// XOR is associative (like sum)
// i.e, (2 XOR 3) XOR 4 = 2 XOR (3 XOR 4), So the order doesn't matter in performing XOR operation.
// eg, 2^3^4^6 = 3^2^6^4 = 4^2^6^3 ......

// So, using these three properties of XOR , we will solve the question. we will take ans variable with 0 as initial value.
//     And then for each element i in array, we will perform the XOR operation of the element with 0, ans will become 0 if
//     the same number is found (as a XOR a = 0) and so after the completion of the loop, only element with no duplicate number will remain and will be returned as ans.


class Solution {
    public int singleNumber(int[] nums) {
        
        int unique=0;
        for(int i=0;i<nums.length;i++){
            unique ^=nums[i];
        }
        return unique;
    }
}
