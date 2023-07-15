// question Link -> https://leetcode.com/problems/container-with-most-water/description/?envType=featured-list&envId=top-interview-questions
// Explnation Link -> https://leetcode.com/problems/container-with-most-water/solutions/1915172/java-c-easiest-explanations/?envType=featured-list&envId=top-interview-questions


// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.


// SOLUTION---------------------

class Solution {
    public int maxArea(int[] height) {
      
        // we will use two pointer Approach
        // always move the pomter that points to the lower line
        // store the distance between the pointers in another array
        //return the max value

        int left=0,right=height.length-1;

        int max=0;

        while(left<right){
            int width=right-left;
            int length=Math.min(height[left],height[right]);

            int area=width*length;

            max=Math.max(max,area);

            if(height[left]<height[right]) left++;
            else if(height[right]<height[left]) right--;
            else{
                left++;
                right--;
                }
        }

return max;
    }
}
