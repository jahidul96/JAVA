public class Overloading {
    public static void main(String[] args) {
        Demo d1 = new Demo();

        d1.info("just some random demo text!!!");
    }
}

class Demo {
    String name;

    public void info(int a){
        System.out.println("your number is " + a);
    }
    public void info(int a, int b){
        System.out.println("your number is sum is " + (a+b));
    }
    public void info(String a ){
        System.out.println("your number text is " + a);
    }
}
