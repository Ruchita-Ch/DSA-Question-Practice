package TwoPointer;
import java.util.*;
public class Que1Reversell{
public static void SortList(LinkedList<Integer> list){

    ArrayList<Integer> arr = new ArrayList<>();

    for (int val : list){
        arr.add(val);
    }

    //sorting
    Collections.sort(arr);

    for(int i=0; i<list.size() ; i++){
        list.set(i,arr.get(i));
    }
}


public static void main(String[] args){
    LinkedList<Integer> list = new LinkedList<>();

    list.add(5);
    list.add(25);
    list.add(6);
    list.add(45);
    list.add(55);

    SortList(list);
    System.out.println(list);
}
}