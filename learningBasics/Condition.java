public class Condition {
   public static void main(String[] args) {
        String somedate = "29 february";
        String result = (somedate == "29 february") ? "Leap Year" : "Not a Leap Year!!!";
        System.out.println(result);

        int x = 18;
        int max = 18;

        // if else
        if (x>max) {
            System.out.println("you are eligable to vote!!!");
        }else if(x==max){
            System.out.println("congrat's you are 18 now!!!");
        } else {
           System.out.println("you are not Adult"); 
        }
        // ternary operator!!
       String value = (x>max) ? "you are 18 plus" : (x==max) ? "congrat's you are 18 now!!!" : "you are not adult";
       System.out.println(value);


    
    }
}
