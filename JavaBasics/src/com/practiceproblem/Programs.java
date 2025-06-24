package com.practiceproblem;

public class Programs {

	public void m1() {

//		*
//		**
//		***
//		****
//		for (int i = 0; i <= 3; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
// for inverted pattern change only 'i' values------

//		*****
//		****
//		***
//		**
//		*
//		*
//		**
//		***
//		****
//		*****
//		
//		for (int i = 4; i >= 0; i--) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i <= 4; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//			}
//
//			for (int k = 1; k <= 2 * i - 1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// ascii value printing
//		for (int i = 65; i <= 122; i++) {
//			char n = (char) i;
//			System.out.println(n +"  "+i);
//		}

//		char ch = 'd';
//		int n = (int) ch;
//		n = n + 3;
//		char s = (char) n;
//
//		System.out.println("ASCII value: " + n + "  " + s);
		
		
	}

	public static void main(String[] args) {
		Programs p1 = new Programs();
		p1.m1();
	}

}
