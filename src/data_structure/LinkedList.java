
package data_structure;

import static sun.org.mozilla.javascript.internal.Token.name;

class Node
{
    String name,link ;
    Node next ;
    
    Node (String name,String link)            
        {      
            this.name=name;
            this.link=link;
            next=null;
        }
}

public class LinkedList {
    
    Node head,last;
    int size=0;
    
    LinkedList()
    {
        head=last=null;
        size=0;
    }
    boolean isEmpty()
    {
        return size==0;
    }
    void insert(String name,String link)
    {
        Node n=new Node(name,link);
        if(isEmpty())
        {
            head=last=null;
            n.next=null;
        }
        else
        {
            last.next=n;
            n.next=null;
            last=n;
        }
        size++;
    }
    void print()
    {
        Node current=head;
        System.out.println("vedio in program="+size);
        while(current!=null)
        {
            System.out.println(current.next);
            current=current.next;
        }
        System.out.println("================");
        System.out.println("");    
    }
    String search(String name)
    {
        Node current=head;
        while(current!=null)
        {
            if(current.name.equals(name))               
                return current.link;
                current=current.next;                     
        }
        return null;           
    }
    void update(String name,String link)
    {
        Node current=head;
        while(current!=null)
        {
            if(current.link.equals(link))
                current.name=name;
            current=current.next;
        }
        return;
    }
    void next()
    {
        head=head.next;
    }
    void delete(String name)
    {
        if(head.name.equals(name))
        {
            head=head.next;
            size--;
            if(size==0)last=null;
        }
        else
        {
            Node current=head.next;
            Node pre=head;
            while(current!=null)
            {
                if(current.name.equals(name))break;
                pre=current;
                current=current.next;
            }
            if(current==null)return;
            else
            {
                pre.next=current.next;
                if(last==current)last=pre;                    
                size--;
                return;
            }
        }
        return;           
    }
    

    public static void main(String[] args) {
        new World_Cup().setVisible(true);

    }   
    
}

