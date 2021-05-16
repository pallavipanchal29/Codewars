package string;

public class StringToCamelCase
{
    static String toCamelCase(String s)
    {
        StringBuilder sb = new StringBuilder();
        String[] words = s.contains("-") ? s.split("-") : s.split("_");
        for(int i = 0;i<words.length;i++)
        {
            if(i == 0)
                sb.append(words[i]);
            else
                {
                sb.append(words[i].substring(0, 1).toUpperCase());
                sb.append(words[i].substring(1));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }
}
