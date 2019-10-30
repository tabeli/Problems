public class IntersectionTwoLinkedList_160{
    public static void main(String[] args){
        ListNode l1 = ListNode.buildList(new int[]{1,2,4});
        ListNode l2 = ListNode.buildList(new int[]{1,3,5});
        ListNode l3 = ListNode.buildList(new int[]{5,6,7});

        ListNode temp = l1.getLast();
        temp.next = l3;

        ListNode temp2 = l2.getLast();
        temp2.next = l3;
       
        ListNode intersection = getIntersectionNode(l1, l2);
        System.out.println(intersection);
    }

    /*  Paso 1: Me voy al final de listaA y apunto a listaB
        Paso 2: turtle = headA  -> turtle + 1 y rabbit = headA -> rabbit + 2 hasta intersectar 
        Paso 3: turtle = headA  turtle + 1 y rabbit + 1 hasta intersectar
        Paso 4: return turtle
    */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {        
        if(headA == null || headB == null) return null;        
        ListNode turtle = headA;
        ListNode rabbit = headA;                        

        
        while(turtle.next != null){                      
            turtle = turtle.next;
        }        
        ListNode tailA = turtle;
        turtle.next = headB;        
        

        turtle = headA;
        rabbit = headA;        
                
        while(turtle != null && rabbit != null) {                   
            turtle = turtle.next;
            rabbit = rabbit.next;
            if(rabbit != null) rabbit = rabbit.next;
            if(rabbit == turtle){
                break;
            }
        }
        if(turtle == null || rabbit == null) {
            tailA.next = null;        
            return null;
        }
        turtle = headA;
        while(turtle != rabbit){            
            turtle = turtle.next;
            rabbit = rabbit.next;
        }

        tailA.next = null;        
        
        return turtle;
    }    

}