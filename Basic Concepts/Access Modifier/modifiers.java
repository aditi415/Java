/* 
    public - it can be accessed by all the classess and packages
    private - it can be accessed by the same class 
    default - it can access in the same package     
    protected - The code is accessible in the same package and subclasses.

                                   private   protected    public   default
same class                          yes         yes          yes      yes   
same package subclass               no          yes          yes      yes 
same package non-subclass           no          yes          yes      yes 
different package subclass          no          yes          yes      no
different package non-subclass      no          no           yes      no 
*/

class C extends A{
    public void abc(){
        System.out.println(marks);
    }
}

public class modifiers
{
    public static void main(String[] args)
    {
        A obj = new A();
        System.out.println(obj.marks);

        B obj1 = new B();
        System.out.println(obj1.marks);


    }
}