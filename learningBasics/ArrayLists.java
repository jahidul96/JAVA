import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();


        // adding data to array
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

// // get one array data
//         int getOne = list.get(3);
//         System.out.println(getOne);


//         // reomve from array!!
//         int removed = list.remove(getOne);
//         System.out.println(removed);
//         System.out.println(list);


// see list length
        System.out.println(list.size());

        // contains or not
        System.out.println(list.contains(10));
    }
}
