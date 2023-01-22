package Sorting;

import java.util.Arrays;

public class QuickSort1 {
	public void swap(int arr[],int x,int y) {
		int temp=arr[x];
		 arr[x]=arr[y];
		 arr[y]=temp;
		
	}
	public int partition(int[] arr,int start,int end) {
		int pivot=arr[start];
		int count=0;
	 for(int i=start+1;i<=end;i++) {
		 if(pivot>=arr[i]) {
		 count++;
		 } 
	 }
	 int pvot_idx=start+count;
	 swap(arr,start,pvot_idx);
	 int i=start;
	 int j=end;
	 while(i<pvot_idx && j>pvot_idx) {
		 if(pivot>=arr[i]) {
			 i++;
		 }
		 else if(pivot<=arr[j]) {
			 j--;
		 }
		 else {
			 swap(arr,i,j);
		 }
	 }
	 return pvot_idx;
	 
		
	}
	public void QuickSort(int arr[],int start,int end) {
		if(start<end) {
		int j=partition(arr, start, end);
		QuickSort(arr,start,j-1);
		QuickSort(arr, j+1, end);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 8, 6, 12, 6, 15, 3, 9, 5, 20 };
		QuickSort1 qs = new QuickSort1();
		qs.QuickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
