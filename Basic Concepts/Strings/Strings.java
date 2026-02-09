public class Strings
{
    public static void main(String[] args)
    {
        /*String name=new String("avi");    // or String name= "avi";
        System.out.println(name);
        name +="reddy";
        //hash code
        System.out.println(name.hashCode());
        System.out.println("hello " + name);
        System.out.println(name.concat("owal"));

        String s1="navin";
        String s2="yash";

        System.out.println(s1=s2);*/

        //stringbuffer- thread safe 
        StringBuffer sb = new StringBuffer("adhi");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append("reddy"));
        sb.deleteCharAt(3);
        sb.substring(1, 5);
        System.out.println(sb);

    }
}