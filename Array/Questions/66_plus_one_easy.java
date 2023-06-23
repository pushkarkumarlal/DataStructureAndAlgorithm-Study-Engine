// 66. Plus One 
// Link - https://leetcode.com/problems/plus-one/?envType=featured-list&envId=top-interview-questions

class Solution {
    public int[] plusOne(int[] digits) {
    // i did the above solutions from solutions section of leetcode with the most vote
int n=digits.length;

for(int i=n-1;i>=0;i--){
    if(digits[i] < 9){
        digits[i]++;
        return digits;
    }
    digits[i]=0;
}
int[] newNumber=new int [n+1];
newNumber[0]=1;

return newNumber;

    }
}
