package linkedlist;

public class insert {
    private Node head;
    private Node tail;
    private int size;

    public insert(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size +=1;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
        if(tail==null){
           insertFirst(val);
           return;
        }

    }
    public int deleteLAst(){
        if(size<=1){
            return firstde();
        }
        Node sec = get(size-2);
        int value = tail.value;
        tail = sec;
        tail.next= null;
        return value;
    }
public int any(int index){
    if(index==0){
     return firstde();
    }
     if(index==size-1){
     return deleteLAst();
     }
     Node age =get (index-1);
     int val = age.next.value;
     age.next = age.next.next;
     return val;

}

   public Node get(int index){
    Node node = head;
    for(int i = 0;i<index;i++){
        node = node.next;

    }
    return node;
   } 
   public Node fin(int val){
    Node node = head;
    while(node!=null){
        if(node.value==val){
            return node;
        }
        node = node.next;
    }
    return null;
   } 
    public int firstde(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public void justinsert(int val , int index){
        if(index== 0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return ;
        }
        Node temp =head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next= node;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
System.out.print("END");
    }
    private class Node{
            private int value;
            private Node next;

            public Node(int value){
            this.value= value;
            }
            public Node (int value,Node next){
                this.value = value;
                this.next = next;
            }
         }
    }

