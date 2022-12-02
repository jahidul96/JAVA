

public class Index {
  public static void main(String[] args) {
   Demo d = new Demo("text is wrinting");

   d.d();
} 
}

class Demo {
  String text;

  Demo(String text){
    this.text = text;
  }

  public void d(){
    System.out.println(text);
  }
}



