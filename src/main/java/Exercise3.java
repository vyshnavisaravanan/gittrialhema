import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Exercise3
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter From Range:");
        int fromRange = scan.nextInt();
        System.out.println("Enter end range");
        int endRange = scan.nextInt();
        Exercise3 e3=new Exercise3();
        e3.primeNumber(fromRange,endRange);
        e3.leftTriangle();
        e3.leftTrianglenum();
        e3.evenNumber(fromRange,endRange);
        e3.oddNumber(fromRange,endRange);
        e3.cumulativeSum(fromRange,endRange);


    }

    public void evenNumber(int fromRange, int endRange)
    {
        System.out.println("EVEN Numbers are:");

        for(int i=fromRange;i<endRange;i++)
        {
            if(i%2==0)
            {
                System.out.print(i +" "  );
            }

        }
    }

    public void oddNumber(int fromRange, int endRange)
    {
        System.out.println(" ");
        System.out.println("ODD Numbers are:");
        for(int i=fromRange;i<endRange;i++)
        {
            if(i%2>0)
            {
                System.out.print(i +" "  );
            }

        }
    }

    public void cumulativeSum(int fromRange,int endRange)
    {
        int sum=0;
        System.out.println(" ");
        for(int i=fromRange;i<endRange;i++)
        {
            sum=sum+i;
        }
        System.out.println("Cumulative Sum is:" +sum);
    }

    public void leftTriangle()
    {
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
    public void leftTrianglenum()
    {
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");

        }
    }
    public void primeNumber(int fromRange,int endRange)
    {
        String primeNumber="";
        for(int i=fromRange;i<endRange;i++)
        {
            int counter = 0;
            for(int j=i;j>=1;j--)
            {
                if(i%j==0)
                {
                    counter=counter+1;

                }

            }
            if(counter==2)
            {
                primeNumber=primeNumber+i+" ";
            }
        }
        System.out.println("PrimeNumbers are:");
        System.out.println(primeNumber);
    }

}
