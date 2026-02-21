
/*
    Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
    There are2 types of Polymorphism 
    1 Compile time - if the behaviour is define at compile time it is compile time polymorphism. Overloading is part of compile time 
    2 Run Time -  if the behaviour is define at Run time it is run time polymorphsim. which method will be execute is at run time. Overriding is part of runtime

*/
class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");

    }
}
public class polyform {
    public static void main(String[] args) {
        A obj = new A();
        //System.out.println();
        obj.show();

        obj = new B();
        obj.show();
        

    }
    
}
