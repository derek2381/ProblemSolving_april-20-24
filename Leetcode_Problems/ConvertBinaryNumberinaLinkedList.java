// problem link
// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/

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
    public int getDecimalValue(ListNode head) {
        Stack<Integer> stk = new Stack<Integer>();

        ListNode temp = head;

        while(temp != null){
            if(temp.val == 1){
                stk.push(1);
            }else{
                stk.push(0);
            }
            temp = temp.next;
        }
        int k = 0,val = 0;
        while(!stk.empty()){
            if(stk.peek() == 1){
                val += (1 << k);
            }
            k++;
            stk.pop();
        }

        return val;
    }
}
