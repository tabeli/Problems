public class DeleteNode_237{
    public static void main(String[] args){
        ListNode delete = ListNode.buildList(new int[]{1,3,5,7});
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}