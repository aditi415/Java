class Human
{
    private int age;  //accessable only in the same class its private 
    private String name;
      
        //methods- get and set methods use to access private variable 
    public int getAge()  //get the  value
    {
        return age;
    }

    public void setAge(int age){         //set the value 
        this.age=age;           //local variable
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String n){
        name = n;
    }

        //Constructor- It is a special method it has same name as a class name, it never returns anything like int,float..etc. Everytime we create object constructor will call automatically

    public Human()
    {
        System.out.println("in constuctor");
    }

    public Human(int a,String p)      //parametrized constructor
    {
        age=a;
        name=p;
    }
}

public class encaps 
{
    public static void main(String[] args)
    {
        Human obj=new Human();
        obj.setAge(23);;
        obj.setName("adhi");

        System.out.println(obj.getName() + ":" + obj.getAge());
        System.out.println(obj.getName() + ":" + obj.getAge());

    }
    
}
