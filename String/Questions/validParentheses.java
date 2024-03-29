// [Question Link]- https://leetcode.com/problems/valid-parentheses/description/
//Easy


// Approach:
// Create an empty stack to keep track of opening parentheses.
// Loop through each character in the input string.
// If the character is an opening parentheses, push it onto the stack.
// If the character is a closing parentheses, pop the top element from the stack and check whether it matches the corresponding opening parentheses for the current closing parentheses.
// If the stack is empty and all parentheses have been matched, return True. Otherwise, return False.
  
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
