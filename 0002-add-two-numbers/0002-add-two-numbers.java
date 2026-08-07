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
        
        // long num1=0l,n1=1;
        // long num2=0l,n2=1;
        // while(l1!=null){
        //     num1 += l1.val*n1;
        //     n1*=10;
        //     l1=l1.next;
        // }
        // while(l2!=null){
        //     num2+=l2.val*n2;
        //     n2*=10;
        //     l2=l2.next;
        // }
        // long num3 = (long)num1+num2;
        // ListNode l3 =new ListNode(0);
        // ListNode curr = l3;
        // if(num3==0){
        //     return new ListNode(0);
        // }
        // while(num3>0){
        //     int rem =(int) (num3%10);
        //     curr.next= new ListNode(rem);
        //     curr=curr.next;
        //     num3/=10;
        // }
        // return l3.next;

        int carry=0;
        int sum=0;
         ListNode l3 =new ListNode(0);
         ListNode curr = l3;
        while(l1!=null || l2!=null){
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            int rem = sum%10;
            curr.next= new ListNode(rem);
            curr=curr.next;
            carry = sum/10;
            sum=0;

        }
        if(carry>0)
        curr.next=new ListNode(carry);
        return l3.next;
    }
}