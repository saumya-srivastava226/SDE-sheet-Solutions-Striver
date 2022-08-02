class Solution {
    // This method is designed to find the middle node of the list
    public ListNode middleNode(ListNode head)
    {
        ListNode hare=head;
        ListNode tortoise=head;
        while(hare!=null&&hare.next!=null)
        {
            hare=hare.next.next;
            tortoise=tortoise.next;
        }
        return tortoise;
    }
    // This method is to reverse the linked list
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null)
        {
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        
        ListNode mid=middleNode(head);
        ListNode last=reverse(mid);
        ListNode cur=head;
        if(head==null)
            return true;
        while(last!=null)
        {
            if(cur.val!=last.val)
                return false;
            cur=cur.next;
            last=last.next;
        }
        return true;
        
    }
}
