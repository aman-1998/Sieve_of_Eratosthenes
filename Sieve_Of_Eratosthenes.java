import java.util.Scanner;
import java.lang.Math;
class Sieve_Of_Eratosthenes
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter upper limit: ");
		n=in.nextInt();
		int[] prime=new int[n+1];
		// here we have used 0 to mark non-prime nos.
		for(i=0;i<=n;i++)
			prime[i]=1;
		prime[0]=0;
		prime[1]=0;
		for(i=2;i<=Math.sqrt(n);i++)
		{
			for(j=2;j<=n;j++)
			{
				if(prime[j]==1)
				{
					if(j%i==0 && j!=i)
					prime[j]=0;
				}
			}
		}
		System.out.print("\nPrime nos.\n");
		for(i=2;i<=n;i++)
		{
			if(prime[i]==1)
				System.out.print(i+" ");
		}
	}
}