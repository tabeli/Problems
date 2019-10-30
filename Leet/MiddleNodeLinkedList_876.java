public class MiddleNodeLinkedList_876{
    public static void main(String[] args){
        ListNode l1 = ListNode.buildList(new int[]{1,2});
        ListNode result = middleNode(l1);
        System.out.println(result);
    }
    public static ListNode middleNode(ListNode head) {
        ListNode temp = null;
        int size = getSize(head);
        if(size % 2 == 0){
            size = (size/2) + 1;            
        } else {            
            size = (int) Math.ceil((float)size/2);            
        }
        for(int i = 1; i < size; i ++){
            head = head.next;
        }
        temp = head;

        return temp;
    }

    public static int getSize(ListNode head){        
        int size = 1;
        while(head.next != null){
            head = head.next;
            size++;
        }                
        return size;
    }
}