
public class wrapper {
    public static void main(String[] args) {
        int num=90;
        Integer num1= num;            //autoboxing

        int num2 = num1.intValue();  //unboxing
        int num3 = num1; //auto-unboxing

        System.out.println(num);

        String str="13";
        int num4=Integer.parseInt(str);

        System.out.println(num4*2);
    }
}
