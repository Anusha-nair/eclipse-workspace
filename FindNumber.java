import java.util.Scanner;
/**
 * 
 import java.util.Scanner;
 */

/*
Program Name:FindNumber.java
      Author: Anusha nair
        Date:Oct. 18, 2019 9:02:13 p.m.
 Description:
 */
public class FindNumber
{

	public static void main(String[] args)
	{
// given array 
int[]numbers= {4,5,7,2,6,7,8,3};
// max as number 0
int max =numbers[0];

//for loop for iteration
for (int i = 1; i<numbers.length;i++)
{
	// if condition for checking max number in array
if(numbers[i]>max)	
{
	max= numbers[i];
}

	}
// printing the max array
System.out.println("Largest number "+ max);
}
	
}






 



	
