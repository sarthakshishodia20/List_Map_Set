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
    // jb tk linkedlist ke elments set mein present hai tb tk aage bdhte rho vrna toh components increase kro
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int components=0;
        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp.val) && (temp.next==null || !set.contains(temp.next.val))){
                components++;
            }
            temp=temp.next;
        }
        return components;
    }
}
