package linkedlist.interview;

public class insertrec {

    
    private class Node{
        private int value;
        private Node next;
 
      public Node(int value){
         this.value = value;
      }
      public Node(int value , Node next){
         this.value = value;
         this.next = next;
      }
}
}