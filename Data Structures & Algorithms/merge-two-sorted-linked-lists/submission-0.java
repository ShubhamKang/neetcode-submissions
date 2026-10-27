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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode output = new ListNode();
        ListNode curr = output;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                output.next = list1;
                output = output.next;
                list1 = list1.next;
            }
            else{
                output.next = list2;
                output = output.next;
                list2 = list2.next;
            }
        }
        if(list1!= null){
            output.next = list1;
        }
        else{
            output.next = list2;
        }

        return curr.next;
    }  
}