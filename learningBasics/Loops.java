public class Loops {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for(int i =0; i <= numbers.length; i++){
            if(i%2==0 ){
                continue;
            }
          System.out.println(i);
        }

         for (int number : numbers) {
            System.out.println(number);
        }
     
    }
}
