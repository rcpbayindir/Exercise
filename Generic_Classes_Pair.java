package Generic_Classes;

/**
 * Created by recep-usr on 24.7.2015.
 */
public class Pair<T1,T2> {
    private T1 firsItem;
    private T2 secondItem;
    public Pair(T1 first,T2 second){
        firsItem=first;
        secondItem=second;
    }
    public T1 first(){
        return firsItem;
    }
    public T2 second(){
        return secondItem;
    }
}
