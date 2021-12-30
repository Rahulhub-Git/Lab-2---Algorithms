package com.greatlearning.notescountservice;

public class NotesCounterService {

	
	public void notesCounter(int SortedNotesArr[],int amt) {
		int notescount[]=new int[SortedNotesArr.length];
		
		

		for(int i=SortedNotesArr.length-1;i>=0;i--) {
			
			if (amt>=SortedNotesArr[i]) {
				
				notescount[i]=amt/SortedNotesArr[i];
				amt=amt-notescount[i]*SortedNotesArr[i];
				
				
			}
		}
			if(amt==0)
			{
				
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(int i=SortedNotesArr.length-1;i>=0;i--) {
					if(notescount[i]!=0)
					System.out.println(SortedNotesArr[i]+":"+notescount[i]);
					
	}
	}
			
	else
	System.out.println("The requested amount cannot be paid with the available notes");
				
					
	
				
				
				
				
			}
			
		}
		
		
		
		
		
		
		
	
	
	

