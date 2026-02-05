public class methods
{
    public void playMusic()
    {
        System.out.println("Music playing");
    }

    public String getMePen(int cost)
    {
        if(cost>=10)
            return "Pen";
        else
            return "Nothing";
    }

    public static void main(String[] args)
    {
        methods obj=new methods();
        obj.playMusic();
        String str=obj.getMePen(2);
        System.out.println(str);

    }
}