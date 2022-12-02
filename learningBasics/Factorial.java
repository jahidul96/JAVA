public class Factorial {

    // factorial recursive way
    static int recursive(int n){
        if(n<1){
            return 1;
        }else{
            return n * recursive(n-1);
        }
    }


    // factorial loop way
    static int recFoorLoop(int x){
        int val = 1;
        if(x<1){
            return 1;
        }
            for (int index = 1; index <= x; index++) {
                val = val * index;
            }
            return val;
    }

   public static void main(String[] args) {
    int res = recursive(5);
    System.out.println(res);

    int value = recFoorLoop(4);

    System.out.println(value);
   }
}
