// link - https://leetcode.com/problems/excel-sheet-column-number/submissions/?envType=featured-list&envId=top-interview-questions



class Solution {
    public int titleToNumber(String s) {

        if(s==null) return -1;

        int sum=0;

        for(char c: s.toUpperCase().toCharArray()){

            sum*=26;
            sum+=c-'A'+1;
        }
          return sum;
        //

}
}
