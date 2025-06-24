package com.thiskeyword;

public class Practice2 {

    protected Practice2() {
    	System.out.println("This is constructor 1");
    }
    
    Practice2(int a){
    	this();
    	System.out.println("This is constructor 2.");
    }
    
    public static void main(String[] args) {
		
    	Practice2 p = new Practice2(1);
	}
}
