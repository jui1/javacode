import java.util.Stack;
public class insertanddelete {
    public static void main(String[] args) {
       Stack<Integer> jam = new Stack<>();
       jam.push(45);
       jam.push(4);
       jam.push(5);
       jam.push(75);
       jam.push(49);
       jam.push(500);

       System.out.println(jam.pop());
       System.out.println(jam.pop());
       System.out.println(jam.pop());
       System.out.println(jam.pop());
       System.out.println(jam.pop());
       System.out.println(jam.pop());

    }
    
}
