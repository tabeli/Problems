public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }

    public ListNode getLast(){
        ListNode head = this;
        while(head.next != null){
            head = head.next;
        }

        return head;
    }

    public String toString(){
        String result = "-> ";
        ListNode head = this;
        while(head != null){
            result += head.val + " -> ";
            head = head.next;
        }
        return result;
    }

    public void insert(int x){
        ListNode head = this;
        while(head.next != null){
            head = head.next;
        }
        head.next = new ListNode(x);
    }

    public static ListNode buildList(int[] arr){
        ListNode head = null;
        if(arr.length > 0){
            head = new ListNode(arr[0]);
            for(int i = 1; i < arr.length; i++){
                head.insert(arr[i]);
            }
        }
        return head;
    }
}
