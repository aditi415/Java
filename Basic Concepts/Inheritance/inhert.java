 /*subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from*/

package inheritance;

import Calc;
import AdvCalc;
import veryAdvCalc;

public class inhert {
    public static void main(String[] args)
    {
        Calc obj=new Calc();
        AdvCalc obj1=new AdvCalc();
        veryAdvCalc obj2= new veryAdvCalc();

        int r1 = obj.add(45, 33);
        int r2 = obj.sub(6,8);

        int r3 = obj1.multi(34,67);
        int r4 = obj1.div(8,2);
   
        double r5 = obj2.power(78.5, 89.654);

        System.out.println(r1 +":" +r2);
        System.out.println(r3 +":" +r4);
        System.out.println(r5);


    } 
}
