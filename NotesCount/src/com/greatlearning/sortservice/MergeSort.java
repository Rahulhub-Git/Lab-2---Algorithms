package com.greatlearning.sortservice;

public class MergeSort {
	public void merger(int arr[],int L,int R,int M) {
		
		int len1=M-L+1;
		int len2=R-M;
		
		int LeftArr[]= new int[len1];
		int RightArr[]=new int[len2];
		
		for(int i=0;i<len1;i++)
	     LeftArr[i]=arr[L+i];
		
		for(int j=0;j<len2;j++)
		RightArr[j]=arr[M+1+j];
		
		int i=0;
		int j=0;
		int k=L;
		
		while(i<len1 && j<len2)
		{
			if(LeftArr[i]<= RightArr[j]) {
				arr[k]=LeftArr[i];
			i++;
			}
			else
				{arr[k]=RightArr[j];
			     j++;
				}
			k++;
		}
			while(i<len1)
			{
				arr[k]=LeftArr[i];
				i++;
				k++;
				
			}
			while(j<len2) {
				
				arr[k]=RightArr[j];
				j++;
				k++;
			}
			
			
		
		
		
		
		
	}
		public void sort(int Arr[],int left,int right) {
			if(left<right) { 
			int mid = (left+right)/2;
			
			sort(Arr,left,mid);
			sort(Arr,mid+1,right);
			
			merger(Arr,left,right,mid);
			
			
			}
			
		}

	
	

}
