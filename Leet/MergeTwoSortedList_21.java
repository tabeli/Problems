public class MergeTwoSortedList_21{
    public static void main(String[] args){
        ListNode l1 = ListNode.buildList(new int[]{1,2,4});
        ListNode l2 = ListNode.buildList(new int[]{1,3,4});        
        
        System.out.println(l1);
        System.out.println(l2);
        ListNode result = mergeTwoLists(l1, l2);
        
        System.out.println(result);
    }   

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {        
        ListNode head = null;
        ListNode pointer = null;
        while(l1 != null || l2 != null){
            if(l1 == null){
                pointer = l2;
                l2 = null;
            } else if(l2 == null){
                pointer = l1;
                l1 = null;
            } else if(l1.val > l2.val){
                pointer = l2;
                l2 = l2.next;
                pointer.next = null;
            } else if(l2.val >= l1.val){
                pointer = l1;
                l1 = l1.next;
                pointer.next = null;
            }             
            if(head == null){
                head = pointer;
            }
            else{
                insert(head,pointer);
            }
        }
        return head;
    }

        

    public static void insert(ListNode head, ListNode node){
        if(head == null){
           head = node; 
        }
        else{
            ListNode pointer = head;
            while(pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = node;
        }
    }
}
    