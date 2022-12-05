import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list.add(10);
        list.addAll(0, list1);

        System.out.println(list);
    }
}
