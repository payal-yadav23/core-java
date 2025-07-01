package com.checkedexception;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {

		ClassNotFndExctn p = new ClassNotFndExctn();

		p.m1();
		p.m2();

	}
}
