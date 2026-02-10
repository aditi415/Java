//static variable referes to the class not to the object

class Mobile{
    String brand;
    int price;
    static String name;             //static variables are shared by objects
    
    public void show(){
        System.out.println(brand + ":" + price + ":" + name );
    }

   // public static void show1(Mobile.obj)                 //static method
    //{
      //  System.out.println(obj.brand + ":" + obj.price + ":" + obj.name );        
    //}


            //static block- it is used to initialize static variable 
    static{
        name="Phone";
        System.out.println("in static block");
    }

    public Mobile()
    {
        brand="nokia";
        price = 200;
        System.out.println("in constructor");
    }
}

public class statvar 
{
    public static void main(String[] args) 
    {
        Mobile obj1 = new Mobile();
        obj1.brand="apple";
        obj1.price=12344;
        Mobile.name="smartphone";      //static variable should be called by its classname not by object
       
        Mobile obj2 = new Mobile();
        obj2.brand="samsung";
        obj2.price=233;
        Mobile.name="smartphone"; 

        obj1.show();
        obj2.show();

        Class.forName("Mobile");        //load class
    }
}
