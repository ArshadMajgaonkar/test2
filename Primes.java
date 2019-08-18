class Primes
{
    public static void main(String args[]) {
        int n=1,i,flag=0;

        do{
            for(i=1;i<=n;i++)
            {
                if(n%i == 0)
                {
                    flag++;
                }
            }
           
            if(flag == 2)
            {
                System.out.print(n + " ");
            }

            n++;
        }while(n<=50);

    }
}