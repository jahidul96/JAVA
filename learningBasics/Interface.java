

public class Interface {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.multiply(5, 10);
    }
}


interface Multiply {
    void multiply(int a, int b);
}

class Demo implements Multiply {
    public void multiply(int a, int b){
        System.out.println("multiply is " + (a*b));
    };
}
