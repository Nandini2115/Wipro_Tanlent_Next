package college;

import java.util.Scanner;

public class smallestinarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int size= sc.nextInt();
		int arr[]=new int[size];
		System.out.println("elements of array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}	
		}
		System.out.println("min value "+min);
	}
}