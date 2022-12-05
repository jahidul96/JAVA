import java.util.HashMap;

public class ObjMap {
   public static void main(String[] args) {
    HashMap<String, String> country = new HashMap<>();

    country.put("us", "United State of America");
    country.put("bd", "Bangladesh");
    country.put("ch", "China");
    country.put("us", "america");

    System.out.println(country);

   } 
}
