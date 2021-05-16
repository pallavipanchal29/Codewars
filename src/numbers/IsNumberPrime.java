package numbers;

public class IsNumberPrime
{
    public static boolean isPrime(int num)
    {
        if(num == 1)
        for(int i = 2;i< num/2;i++)
        {
            if(num % i == 1)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(isPrime(1));
    }
}
