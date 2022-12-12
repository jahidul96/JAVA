package ground;
public class Ground {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.name = "jahidul islam";
        d1.hello();
    }
}

class Demo {

    String name;
    int age;
    void hello(){
        System.out.println("hello from " + this.name);
    }
}
