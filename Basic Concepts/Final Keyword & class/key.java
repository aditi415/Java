
final class calc{             //if we make class final we stop the inheritance means no other class can inherit the property from final class 
    public final void show(){               //here method is overriding to stop this final keyword is used
        System.out.println("in calc show");
    }

    public void add(int a,int b){
        System.out.println(a+b);
    } 
}

class Advcalc extends calc{
    public void show(){
        System.out.println("in calc show");
    }
}

public class key {
    public static void main(String[] args) {
        //final variable no value will be changed
        final int num=98;    //making value constant using finali.e means final variable means making constants
        System.out.println(num);

        calc obj=new calc();
        obj.show();
        obj.add(23, 45);

    }
}
