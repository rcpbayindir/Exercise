package Generic_Classes;

/**
 * Created by recep-usr on 24.7.2015.
 */
public class ArrayDisp {
    static  <T> void Display(T[] arr){
        for (int i=0;i<arr.length;++i){
            if (arr[i]!=null){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String args[]) {
        String[] names = new String[10];
        names[0] = "David";
        names[1] = "Dean";
        names[2] = "Sam";
        names[3] = "Bob";
        names[4] = "Recep";
        names[5] = "Tom";
        Display(names);
        Integer[] numbers=new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Display(numbers);
    }
    }
