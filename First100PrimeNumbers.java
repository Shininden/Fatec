public class First100PrimeNumbers 
{
    public static void main(String[] args) 
    {
        int n = 2, tot_Of_Primes = 0;

        System.out.print("2 ");

        do 
        {
            int divisor = 2;
            int halfway = n / 2;
            boolean isPrime = true;

            do 
            {
                if(n % divisor == 0)
                    isPrime = false;

                divisor++;
            } 
            while (divisor <= halfway && isPrime);


            if(isPrime)
            {
                System.out.print(n + " ");
                tot_Of_Primes++;
            }
            n++;
        } 
        while (tot_Of_Primes <= 100);
    }
}