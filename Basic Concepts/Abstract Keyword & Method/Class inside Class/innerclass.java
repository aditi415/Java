
class A{
    int age;
    public void show(){
        System.out.println("in show");
    }
    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}
public class innerclass {
    public static void main(String[] args) {
        A obj=new A();
        /*{
            public void show(){             //anonymous class
                System.out.println("in new show");
            }
        };*/

        obj.show();

        A.B obj1=obj.new B();           //to create object of B(inner class) we need object of A(outer class)
        obj1.config();

    }
}
