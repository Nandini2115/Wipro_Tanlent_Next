package college;

import java.util.Scanner;

public class oddarray {

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
		System.out.println("odd elements of array");

				for(int i=0;i<size;i++) {
					if(arr[i]%2!=0) 
						System.out.println(arr[i]);	
					}
	}

}