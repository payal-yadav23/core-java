package com.thiskeyword;

public class Demo2 {

    protected Demo2() {
    	System.out.println("This is constructor 1");
    }
    
    Demo2(int a){
    	this();
    	System.out.println("This is constructor 2.");
    }
    
    public static void main(String[] args) {
		
    	Demo2 p = new Demo2(1);
	}
}
