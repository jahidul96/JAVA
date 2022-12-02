public class Factorial {
    static int recursive(int n){
        if(n<1){
            return 1;
        }else{
            return n * recursive(n-1);
        }
    }

   public static void main(String[] args) {
    int res = recursive(5);
    System.out.println(res);
   }
}
