class Plane1{
    public final void fly(){
        System.out.println("Plane is flying");
    }

}
class FighterPlane1 extends Plane1{

 // final Method we cannot be override

}


public class Task8 {
    public static void main(String[] args) {
        FighterPlane1 f1=new FighterPlane1();
        f1.fly();
    }
    
}
