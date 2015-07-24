package Generic_Classes;

/**
 * Created by recep-usr on 24.7.2015.
 */
public class LinkedList<T> {
    public static void main(String args[]){
        Node<String> node1=new Node<String>("John");
        Node<String> node2=new Node<String>("Tom");
        Node<String> node3=new Node<String>("David");
        node1.next=node2;
        node2.next=node3;
        Node<String> footer=new Node<String>("Footer");
        node3.next=footer;
        Node<String> dummy;
        dummy=node1;
        while (dummy.next!=null){
            System.out.println(dummy.getData());
            dummy=dummy.next;
        }



    }
}
