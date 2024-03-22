import java.util.*;
class Linked
{
    Node head;
class Node{
    int data;
    Node next;
    Node(int val) {
        data =val;
        next=null;
    }
}
public void insert(int da)
{
    Node newNode =new Node(da);
   
    if(head==null)
    {
    head=new Node(da);
    return;
    }
    newNode.next= null;
    Node temp=head;
    while(temp.next!=null)
    {
        temp=temp.next;
    }
     temp.next=newNode;
    return ;
}
public void show()
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
}
public void isPalindrome()
{
Node temp=head,mid=head,fast=head;
while(fast!=null && fast.next!=null)
{
    
    mid=mid.next;
    fast=fast.next.next;
    
}
Node prev=mid;
mid=mid.next;
prev.next=null;
while(mid!=null)
{
    temp=mid.next;
    mid.next=prev;
    prev=mid;
    mid=temp;
}
fast=head;
mid=prev;
while(mid!=null)
{
    
    if(mid.data!=fast.data)
    {
        System.out.println("False");
        return ;
    }
    mid=mid.next;
    fast=fast.next;
}
System.out.println("TRue");
}
public static void main(String args[])
{
    Linked ll=new Linked();
    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insert(2);
    ll.insert(1);
    ll.isPalindrome();
    
}
}
