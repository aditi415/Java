class a{
    public  void show1(){
        System.out.println("in a show");
    }
}

class b extends a{
    public void show2(){
        System.out.println("in b show");
    }
}



public class cast {
    public static void main(String[] args){
        double d=9.34;
        int i =(int) d;   //typecasting 

        System.out.println(d);
        System.out.println(i);

        a obj=(a) new b();   //upcasting
        obj.show1();

        b obj1=(b) obj;      //downcasting
        obj1.show2();
    }    
}
