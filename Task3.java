class AeroPlane{
    void fly(){
        System.out.println("Aeroplane is flies");
    }
    void landing(){
        System.out.println("Aeroplane is landing safely.");
    }

}
class PassengerPlane extends AeroPlane{
    //Over Ridden Methods
    void fly(){
        System.out.println("Passanger Plane is flies at medium height.");
    } 
    // Specialized Methods
    void takeOff(){
        System.out.println("passanger plane takeOff at now.");
    }

}
class CargoPlane{

}
public class Task3 {
    public static void main(String[] args) {
        AeroPlane plane=new PassengerPlane(); // upcasting
        plane.fly();
        plane.landing();
        //Inheritance Method
       ((PassengerPlane) plane).takeOff(); // down casting
        
    }
    
}
