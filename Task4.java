class Alpha{

    int a,b;
    public Alpha(){
        a=23;
        b=33;
        System.out.println("Alpha Zero param constructor.");
    }
    public Alpha(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(" alpha parameterized constructor.");
    }

}
class Beta extends Alpha{
    int x,y;
    public Beta(){
        this(2,22);
        x=11;
        y=12;
        System.out.println("Beta zero parameter constructor.");
    }
    public Beta(int x,int y){
        super(4,44);
        this.x=x;
        this.y=y;
        System.out.println(" Beta parameterized constructor.");

    }
    public void display(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }

}


public class Task4 {
    public static void main(String[] args) {
        Beta beta=new Beta();
        beta.display();
    }
    
}
