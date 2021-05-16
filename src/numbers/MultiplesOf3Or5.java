package numbers;

public class MultiplesOf3Or5
{
    public static int solution(int number)
    {
        int sum = 0;
        for(int i =1;i<number;i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
                sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(solution(-5));
    }
}
