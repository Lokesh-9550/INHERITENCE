class Plane{

}
class FighterPlane extends Plane{


}




class Animal{
    public void eating(){
        System.out.println("Animal is eating");
    }
    public void sleeping(){
            System.out.println("Animal is sleeping");
    }
    public Plane running(){
        System.out.println("Animal is running to hunt");
        Plane p=new Plane();
        return p;
    }
    

}
class Tiger extends Animal{
    @Override
    public void eating() {
        System.out.println("Tiger is hunt to eat");
    }
    @Override
    public void sleeping() {
        System.out.println("Tiger is sleeping on land");
    }
   
    public FighterPlane running() {
        System.out.println("Tiger is running to hunt");
        FighterPlane fp=new FighterPlane();
        return fp;
    }

}

public class Task6 {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        t.eating();

    }
    
}
