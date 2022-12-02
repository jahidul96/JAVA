

public class Demo {
    public static void main(String[] args) {
       Person p1 = new Person("jahidul");

      p1.hello();
     
    }
}

class Person {
    String personname;

    public Person(String name){
        personname = name;
    }

  public void hello(){
        System.out.println("hello " + this.personname);
    }

   public String count(){
        return "hell";
    }
}
