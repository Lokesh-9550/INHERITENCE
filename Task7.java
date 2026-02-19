class Demo{
    static int a;
    public static void display(){
        a=10;
        System.out.println("parent class a: "+a);
    }

}
class Demo2 extends Demo{
    public static void display(){   // method hidding
        a=10;
        System.out.println("child class a: "+a);
    }

}


public class Task7 {
    public static void main(String[] args) {
        Demo d=new Demo2();
        d.display();
        // Demo.display();
        Demo2 d2=new Demo2();
        d2.display();

    }
    
}
