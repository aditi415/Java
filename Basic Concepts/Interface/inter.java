/*
    An interface is a completely "abstract class" that is used to group related methods with empty bodies
    interface is like a class just that all the methods are by default public abstract 
    to extend property from class A we have to write implements instead of extends in interface
    all the variables in interfcae is by default final and static 
    we can have class implementing multiple interface 

    imp- 
    class-to-class-> use extends
    class-to-interface-> implements
    interface-to-interface-> extends

    */

interface A {

    int age= 38;
    String area="MG road";

    void show();
    void config();
}

interface  X{

}

interface Y extends X {    
}

class B implements A,Y{                             
    public void show(){
        System.out.println("in B show");
    }

    public void config(){
        System.out.println("in B config");
    }
}


public class inter {
    public static void main(String[] args) {
        A obj;
        obj=new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        System.out.println(A.area);
    }    
}
