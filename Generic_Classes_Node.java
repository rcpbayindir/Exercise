package Generic_Classes;

/**
 * Created by recep-usr on 24.7.2015.
 */
public class Node<T> {
    private T data;
    public Node next;
    public Node(T data){
        this.data=data;
        next=null;
    }
    T getData(){
        return data;
    }
}
