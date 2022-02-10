package com.simplilearn.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int searchItem=4;
		 BinarySearch obj=new  BinarySearch();
		 
		 boolean status=obj.search(searchItem);
		 System.out.println(status+ " \nItem Found.");
	}
	int[] arr= {2,4,6,8,10,12,14,55,98};

	public boolean search(int searchItem) {
		boolean isFound=false;
		int low=0;
		int high =arr.length-1;
		int mid=-1;
		
		while(low<=high) {
			mid=(low+high)/2;
			int arrValue=arr[mid];
			if(searchItem==arrValue) {
				isFound=true;
				break;
			}
			else if(searchItem<arrValue) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return isFound;
	}

}
