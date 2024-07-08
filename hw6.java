import java.io.*;
import java.util.*;

public class hw6 
{
    public static void main(String args[])
    {
        int opt ;
        Scanner scanner = new Scanner(System.in);
        opt = scanner.nextInt();
        if(opt == 1)
        {
            function1();
        }
        else if(opt == 2)
        {
            function2();
        }
        else if(opt == 3)
        {
            function3();
        }
        else
        {
            function4();
        }
    }
    
    public static void function1()
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int matrix[] = new int[number];
        for(int i = 0 ; i < number ; i++)
        {
            int n = scanner.nextInt();
            matrix[i] = n ;
        }
        for(int i = number-1 ; i >= 0 ; i--)
        {
            System.out.print(matrix[i]+" ");
        }
        System.out.println("");
        scanner.close();
    }

    public static void function2()
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean matrix[] = new boolean[number+1];
        for(int i = 1 ; i< number ; i++)
        {
            int n = scanner.nextInt();
            matrix[n] = true ;
        }
        for(int i = 1 ; i< number+1 ; i++ )
        {
            if(!matrix[i])
            {
                System.out.println(i);
            }
        }
        scanner.close();
    }

    public static void function3()
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int arry[] = new int[number+1];
        for(int i = 1 ; i <= number ; i++)
        {
            arry[i] = scanner.nextInt();
        }
        int search = scanner.nextInt();
        int searchR[] = new int[search];
        int searchL[] = new int[search];
        for(int i = 0 ; i < search ; i++)
        {
            searchL[i] = scanner.nextInt();
            searchR[i] = scanner.nextInt();
        }
        for(int i = 0 ; i < search ; i++)
        {
            int l = searchL[i];
            int r = searchR[i];
            int sum = 0;
            for (int j = l; j <= r; j++) 
            {
                sum += arry[j];
            }
            System.out.println(sum);
        }
        scanner.close();
    }

    public static void function4()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arry[][] = new int [n][m]; 
        for(int i = 0 ; i < n ; i++ )
        {
            for(int j = 0 ; j < m ; j++)
            {
                arry[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) 
        {

            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            

            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            

            int temp = arry[x1-1][y1-1];
            arry[x1-1][y1-1] = arry[x2-1][y2-1];
            arry[x2-1][y2-1] = temp;
        }
        for(int i = 0 ; i < n ; i++ )
        {
            for(int j = 0 ; j < m ; j++)
            {
                System.out.print(arry[i][j]+" ");
            }
            System.out.println("");
        }
        scanner.close();
    }
    
}