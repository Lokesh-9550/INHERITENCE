class Parent{
    int i=100;
    public void dis(){
        
        System.out.println("parent class dis is called");
    }
}
class Child extends Parent{
    int i=10;
    public void alpha(){
        
        System.out.println(i);
        System.out.println(super.i);
        this.dis();
    }
    public void dis(){
        System.out.println("Child class display is called");
    }


}

public class Task5 {
    public static void main(String[] args) {
        new Child().alpha();
    }
    
}
