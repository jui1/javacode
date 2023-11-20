package linkedlist.practice;

public class here {

    public void insert(int n){
       Node node = new Node(n);
       node.next = head;
       head = node;

       if(tail == null){
           tail= head;
       }
       size +=1;

    }

    public  void display(){
       Node temp = head;
       while(temp != null){
        System.out.print(temp.value +"--");
        temp = temp.next;
       }
       System.out.println("END");
    }
public void insertrec(int val , int index ){
  head =insertrec(val , index,head);
    } 
  private  Node insertrec(int val , int index ,Node node){
   if(index==0){
      Node tem = new Node(val ,node);
      size++;
      return tem;
   }
    node.next= insertrec(val,index-1,node.next);
    return node;

  }
    private Node head;
    private Node tail;
    private int size;
    public here(){
        this.size =0;
    }
    public void insertrec(){

    }

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
    public void duplicate(){
      Node node = head;
      while(node.next != null){
         if(node.value== node.next.value){
            node.next = node.next.next;
            size--;
         }else{
          node=  node.next ;
         }
      }
      tail = node;
      tail.next = null;
    }
    //
    public static here  marge(here  first , here  sec){
     Node f = first.head;
     Node s = sec.head;
      here ans = new here();
    
     while( f!= null && s != null){
      if(f.value < s.value){
          ans.insert(f.value);
       f=  f.next;
      }else{
         ans.insert(s.value);
         s = s.next;   
         }
     }
     while(f !=null){
         ans.insert(f.value);
         f = f.next;
     }while(s  != null){
         ans.insert(s.value);
         s = s.next;
     }
     return ans;
    }
    
}
