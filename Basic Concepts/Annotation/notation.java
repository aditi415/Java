/*
    Annotaion is a suppliment to a compiler or runtime or also called a Meta data 
*/

class A{
    public void show(){
        System.out.println("in A show");
    }
}
        //override method of A in B 
class B extends A{
    @Override
    public void show(){
        System.out.println("in B show");
    }
}

public class notation {
    public static void main(String[] args) {
        B obj =new B();
        obj.show();

    }
}
