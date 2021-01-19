package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
int count, num1 = 0, num2 = 1;
System.out.println("Please enter the Fibonacci number:");
Scanner scanner = new Scanner(System.in);
count = scanner.nextInt();
scanner.close();
System.out.print("Fibonacci Sequence of "+count+" numbers:");

int i=1;
while(i<=count)
{
    System.out.print(num1+" ");
    int sumOfPrevTwo = num1 + num2;
    num1 = num2;
    num2 = sumOfPrevTwo;
    i++;
}
}
}