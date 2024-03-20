import java.util.*;
class Implements{
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();
    public void add(int data)
    {
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }
        q1.add(data);
        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }

    }
    static int remove(){
        if(q1.isEmpty())
        {
            System.out.println("Queue underflow");
            System.exit(0);
        }
        int ele=q1.peek();
        q1.poll();
        return ele;
    }

}
/**
 * stackUsingQueue
 */
public class stackUsingQueue {

    public static void main(String[] args) {
        Implements s=new Implements();
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(7);
        System.out.println("deleted element is "+s.remove());
    }
}