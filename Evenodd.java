import java.util.Scanner;
/**
 * 
 */

/*
Program Name:Evenodd.java
      Author: Anusha nair
        Date:Oct. 20, 2019 5:54:55 p.m.
 Description:
 */
public class Evenodd
{

	public static void main(String[] args)
	{
		Scanner Obj = new Scanner(System.in);
		int userInput = Obj.nextInt();
 System.out.println("Get input from user" + userInput);
 if(userInput % 2==0)
 {
	 	 System.out.println("Number is Even");
 }
 else
 {
	 System.out.println("Number is odd");
 }
	}

}
