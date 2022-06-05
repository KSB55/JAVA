package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeArray<T> {
    public void changeIndex(T[] array, int ind1, int ind2){
        T a = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = a;

        for(T t : array){
            System.out.println(t);
        }
    }
    public List<T> toArrayList(T[] array){
        return new ArrayList<>(Arrays.asList(array));

    }
}
