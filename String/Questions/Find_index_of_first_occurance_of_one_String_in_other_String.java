// [link Question] - https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
// 28) Find Index Of the first occurrence in a string


class Solution {
    public int strStr(String haystack, String needle) {

        int lenNeedle=needle.length();
        int lenHayStack=haystack.length();

        if(lenNeedle>lenHayStack){
            return -1;
        }

        if(haystack==needle){
            return 0;
        }   

        String temp="";
        for(int i=0;i<=lenHayStack-lenNeedle;i++){
            temp=haystack.substring(i,i+lenNeedle);
            if(temp.equals(needle)){
                return i;  
        }    
    }
     return -1;  
    }
}
