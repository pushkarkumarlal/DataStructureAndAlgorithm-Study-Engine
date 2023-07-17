
//[Question Linl->]  https://leetcode.com/problems/add-two-numbers/description/?envType=featured-list&envId=top-interview-questions
// Approach Solution help - https://leetcode.com/problems/add-two-numbers/solutions/1835535/java-c-a-very-beautiful-explanation-ever-exists/?envType=featured-list&envId=top-interview-questions

// Solution

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode l3=new ListNode();

//         ListNode node_l1=l1;
//         ListNode node_l2=l2;
//         ListNode node_l3=l3;

//         int numL1=0;
//         int numL2=0;

//         int tenCountL1=0;
//         int tenCountL2=0;

// //reverse the linked List

//     while(node_l1!=null || node_l2!=null){        
//         numL1+=node_l1.val * Math.pow(10,tenCountL1);
//         node_l2=node_l1.next;
//         tenCountL1++; 

        
//         numL2+=node_l2.val * Math.pow(10,tenCountL2);
//         node_l2=node_l2.next;
//         tenCountL2++; 
//     }

// int num_L3=numL2+numL1;

// //now insert the digits into a linkedlist
// //start inserting the reamainder

// int quotient=1;
// while(quotient != 0){
// int remainder=num_L3%10;

// quotient=num_L3/10;
// num_L3=quotient;

// //insert the remainder into the  node

// if(quotient !=0){
// ListNode node=new ListNode();
// node_l3.val=remainder;
// node_l3.next=node;
// node_l3=node;
// }else{
//     node_l3.next=null;

// }

// }

// //converting both the
//     return l3;


// for the above code it shows time limit exceed

ListNode dummy=new ListNode(0);
ListNode curr=dummy;

int carry=0;

while((l1 != null) || (l2 !=null) || carry==1){
    
    int sum=0;

    if(l1!=null){
        sum+= l1.val;
        l1=l1.next;
    }

    if(l2!=null){
        sum+= l2.val;
        l2=l2.next;
    }

    sum+=carry;

    carry=sum/10;

    ListNode node=new ListNode(sum%10);

    curr.next=node;
    curr=curr.next;


    


}


  return dummy.next;
     }
}
