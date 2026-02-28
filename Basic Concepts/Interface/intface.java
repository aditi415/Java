class Computer{
    public void code(){

    }
}

class Laptop extends Computer{
    public void code(){
        System.out.println("code compile & run.....");
    }
}

class Desktop{
    public void code(){
        System.out.println("run.....");
    }
}
class Developer{
    public void devApp(Laptop lap){
        //System.out.println("coding......");
        lap.code();
    }
}


public class intface {
    public static void main(String[] args) {

        Laptop lap= new Laptop();
        Desktop desk = new Desktop();

        Computer lap= new Laptop();

        Developer dvp=new Developer();
        dvp.devApp(lap);

         dvp.devApp();
    }
}
