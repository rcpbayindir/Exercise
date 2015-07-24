package Generic_Classes;

/**
 * Created by recep-usr on 24.7.2015.
 */
public class List<T> {
    private T[] datastore;
    private int size;
    private int pos;

    public List (int numElements){
        size = numElements;
        pos=0;
        datastore =(T[]) new Object[size];
    }
    public void add(T element){
        datastore[pos]=element;
        ++pos;
    }
    public String toString(){
        String elements="";
        for (int i =0; i<pos;++i){
            elements+=datastore[i]+" ";
        }
        return elements;
    }

}
