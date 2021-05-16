package string;

public class ExesAnsOhs
{
    public static boolean getXO (String str)
    {
        int countx = 0;
        int counto = 0;
        for(int i = 0;i<str.length();i++)
        {
            if(String.valueOf(str.charAt(i)).equalsIgnoreCase("x"))
                countx++;
            else if(String.valueOf(str.charAt(i)).equalsIgnoreCase("o"))
                counto++;
        }
        return counto == countx;
    }
    public static void main(String[] args)
    {
        System.out.println(getXO("ooxx"));
    }
}
