/**
 * 
 */

/*
Program Name:FibonacciSeries.java
      Author: Anusha nair
        Date:Oct. 19, 2019 9:34:49 p.m.
 Description:
 */
public class FibonacciSeries
{
    public static void main(String args[])
    {
        //maximum upto 6 number 
        int maxNumbers = 6;
        int[] number = new int[maxNumbers];
 
        //create first 2 series elements
        number[0] = 1;
        number[1] = 1;
 
        //created the Fibonacci series
        for(int i=2; i < maxNumbers; i++){
            number[i] = number[i-1] + number[i-2];
            //   2 = 1+1     3 = 2 + 1
            //   number[2]       = 2+1
        }
 
        //For printing series
        System.out.println("Fibonacci Series upto " + maxNumbers);
        for(int i=0; i < maxNumbers; i++)
        {
            System.out.print(number[i] + " ");
        }
    }
}
