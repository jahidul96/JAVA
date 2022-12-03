public class PrimeNumber {
    static boolean isPrime( int n){
        if(n<2){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n%2== 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean res = isPrime(4);
        System.out.println(res);
    }
}
