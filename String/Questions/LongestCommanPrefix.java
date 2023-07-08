// [Question Link-] https://leetcode.com/problems/longest-common-prefix/description/?envType=featured-list&envId=top-interview-questions

class Solution {
    public String longestCommonPrefix(String[] strs) {

        //if length of array is 0 return empty string

        if(strs.length==0){
            return "";
        }
        //if length of array is 1 return strs.[0]

        if(strs.length==1){
            return strs[0];
        }
        

        // sort the array using 

        Arrays.sort(strs);

        //end =find the element with minimum length from first and last element

        int end=Math.min(strs[0].length(),strs[strs.length-1].length());

        int i=0;

        while(i<end && (strs[0].charAt(i) == strs[strs.length-1].charAt(i))){i++;}

        String prefix=strs[0].substring(0,i);

        return prefix;

    }
}
