package com.simplilearn.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int searchItem=22;
		LinearSearch obj=new LinearSearch();
		boolean status= obj.linear(searchItem);
		if(status) {
			System.out.println("Found");
		}else System.out.println("Not Available");

	}
	int[] arr = {2,4,6,22,8,10,12,14,55,98};
	public boolean linear(int searchItem) {
		boolean isFound=false;
		int size=arr.length;
		System.out.println("the number 0f elements present in an array is : "+ size);
		for(int i=0;i<size;i++) {
			int value = arr[i];
			if(value==searchItem) {
				isFound=true;
				break;
			}
		}
		return isFound;
	}

}
