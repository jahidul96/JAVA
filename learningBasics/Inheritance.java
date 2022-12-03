

public class Inheritance {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.eat();
        p1.sleep();
    }
}

class Man {
     void eat(){
         System.out.println("main eat\"s everyDay!! ");
     }
 }

 class Person extends Man{

    @Override
     void eat(){
        System.out.println("man is mortal!!");
    }

     void sleep(){
         System.out.println("person sleep every dat!!!");
     }
 }