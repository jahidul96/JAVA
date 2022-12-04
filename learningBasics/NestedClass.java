public class NestedClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "12345";

        // toyota instance
        Car.Toyoto toyota = car.new Toyoto();
        toyota.info();

        // tesla instance
        Car.Tesla tesla = car.new Tesla();
        tesla.teslaInfo();
        
    }
}

class Car {
    
    String model;

    class Toyoto {
        public void info(){
            System.out.println("this is toyota class " + model);
        }
    }
    class Tesla {
        public void teslaInfo(){
            System.out.println("this is tesla " + model);
        }
    }
}
