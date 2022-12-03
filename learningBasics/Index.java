

public class Index {
  public static void main(String[] args) {
    Demo d = new Demo("just a text!!");
    d.demo();
  }

}

class Demo {
  String text;

  Demo( String text){
    this.text = text;
  }
  public void demo (){
    System.out.println("this is " + text);
  }
}





