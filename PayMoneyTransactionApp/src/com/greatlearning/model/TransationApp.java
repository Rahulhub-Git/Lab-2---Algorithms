package com.greatlearning.model;
import java.util.Scanner;

public class TransationApp {
public static void main(String[] args) {
		
	//Scanner object	
	Scanner s = new Scanner(System.in);

	System.out.println("Enter the size of the transaction array");
  //size of the array
	int sizeofTranArr = s.nextInt();	
	
	System.out.println("Enter the values of array");
	 //transaction array declaration
	int TranArray[] = new int[sizeofTranArr];
	//reading the transaction array elements
	for(int i=0;i<sizeofTranArr;i++)
		TranArray[i]=s.nextInt();	
		
	System.out.println("Enter the total no of targets that needs to be achieved");
	//reading no of targets
	int targetno =s.nextInt();
	
	//transaction operation 
	while(targetno!=0) {
		int flag=0;
		int sum=0;
		System.out.println("Enter the value of target");
		int targetval =s.nextInt();
		for(int i=0;i<sizeofTranArr;i++)
		{
			sum+=TranArray[i];
			
			if(sum>=targetval) {
				
				System.out.println("Target achieved after "+(i+1)+" transactions");
				flag=1;
				break;		
			}
		}
			if (flag==0)
			 System.out.println("Given target is not achieved");
			
			
		targetno--;			
		}	
		
	}
	

}
	
