package Generic_Classes;

/**
 * Created by recep-usr on 24.7.2015.
 */
public class StringList<T> implements IList<T> {
        private T[] datastore;
        private int size;
        private int pos;

        public StringList(int numElements){
            size= numElements;
            pos=0;
            datastore=(T[]) new Object[size];
        }

        public void add(T element) {
            datastore[pos]= element;
            ++pos;
        }
        public T get(int n){
            return datastore[n];
        }
    }


