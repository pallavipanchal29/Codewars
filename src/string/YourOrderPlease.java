package string;

public class YourOrderPlease
{
    public static String order(String words)
    {
        if(words.length() == 0) return "";
        String[] input = words.split(" ");
        String[] temp = new String[input.length];
        StringBuilder answer = new StringBuilder();
        int pos = 0;
        for(int i = 0;i<input.length;i++)
        {
            pos = 0;
            char[] inArray = input[i].toCharArray();
            for(int j = 0;j<inArray.length;j++) {
                if (Character.isDigit(inArray[j])) {
                    pos = Integer.parseInt(String.valueOf(inArray[j]));
                }
                if (pos > 0) temp[pos - 1] = input[i];
            }
        }

        for(int i = 0;i<temp.length;i++)
        {
            if(i != temp.length-1)
                answer.append(temp[i] + " ");
            else
                answer.append(temp[i]);
        }

        return answer.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
