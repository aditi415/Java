/* 
    abstract methods is only in abstract class
    imp:- it is compulsory to define all the abstract methods 
          abstract method should be in the abstract class only no were else 
          in abstract class there can be any methods not compulsory that there should be abstract methods only  
           we can't create object of abstract class, we can create reference of abstract class
*/


abstract class car{
    public abstract void drive();   //defining method
    public abstract void fly();

    public void playmusic(){
        System.out.println("play music");
    }
}
        //concrete class- the class which is not abstract class
class waganor extends car{     //when we extends abstract class we have to override the method 
    public void drive(){
        System.out.println("Driving");
    }
    public void fly(){
        System.out.println("Flying.....");
    }

}
public class abst {
    public static void main(String[] args) {
        car obj=new waganor();
        obj.drive();;
        obj.playmusic();
        obj.fly();
    }
}
