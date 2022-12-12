
import java.util.HashMap;
import java.util.Map.Entry;

public class ObjMap {
   public static void main(String[] args) {
    HashMap<String, String> country = new HashMap<>();

    country.put("us", "United State of America");
    country.put("bd", "Bangladesh");
    country.put("ch", "China");
    country.put("us", "america");

    System.out.println(country);

    System.out.println(country.entrySet());

    for (String ele : country.keySet()) {
      System.out.println(ele);  
    }
    for (Entry<String, String> entry : country.entrySet()) {
        System.out.print(entry);
        System.out.print(", ");
      }
   

   } 
}
