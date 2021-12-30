package com.greatlearning.driver;
import com.greatlearning.notescountservice.NotesCounterService;
import com.greatlearning.sortservice.MergeSort;

import java.util.Scanner;
public class Driver {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
	System.out.println(" Enter the size of currency denominations");
	
	int sizeofdeno;
	
	sizeofdeno= s.nextInt();
	
	System.out.println("Enter the currency denominations value");
	int currArr[]=new int[sizeofdeno];
		
	for(int i=0;i<sizeofdeno;i++)
		currArr[i]=s.nextInt();
	
	MergeSort m= new MergeSort();
	m.sort(currArr,0,currArr.length-1);
		
	
	
	System.out.println("Enter the amount you want to pay");
	
	int amountVal;
	
	amountVal=s.nextInt();
		
	NotesCounterService nc= new NotesCounterService();
	
	nc.notesCounter(currArr,amountVal);
		
		
	}
	
	

}
