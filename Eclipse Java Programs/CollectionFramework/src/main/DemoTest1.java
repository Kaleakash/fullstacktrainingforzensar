package main;

import java.util.Arrays;

public class DemoTest1 {

	public static void main(String[] args) {
		int abc[]= {4,3,1,6,5,2,7,9,8};
		System.out.println("Before sorting");
		for(int n:abc) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("After sorting");
		Arrays.sort(abc);
		for(int n:abc) {
			System.out.print(n+" ");
		}
	}

}
