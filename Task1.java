class Telusko{
    int age;
    void display(){
        age=10;
        System.out.println("Telusko is "+age+" years olde");

    }
}
class Alien extends Telusko{

}

public class Task1{
    public static void main(String[] args) {
        Alien a=new Alien();
        a.display();
    }

}