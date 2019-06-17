#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main()
{
    int n,i,j;
    printf("Enter the upper limit: ");
    scanf("%d",&n);
    int *prime=(int*)calloc((n+1),sizeof(int));
    if(prime==NULL)
    {
        printf("\nMemory can't be allocated\n");
        exit(0);
    }
    // here we have used 1 to mark non-prime nos.
    // because calloc automatically initializes every box with 0
    prime[0]=1;
    prime[1]=1;
    for(i=2;i<=sqrt(n);i++)
    {
        for(j=i*2;j<=(n/i)*i;j+=i)
        {
            if(j%i==0 && j!=i)
                prime[j]=1;
        }
    }
    printf("\nPrime nos:-\n");
    for(i=2;i<=n;i++)
    {
        if(prime[i]==0)
            printf("%d ",i);
    }
    return 0;
}
