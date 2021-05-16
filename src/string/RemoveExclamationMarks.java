package string;

public class RemoveExclamationMarks
{
    static String removeExclamationMarks(String s)
    {
        s = s.replaceAll("!","");
        return s;
    }
    public static void main(String[] args)
    {
        System.out.println(removeExclamationMarks("Hello World!"));
    }
}
