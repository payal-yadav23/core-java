package com.checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassNotFndExctn {

	public void m1() throws ClassNotFoundException {
		Class.forName("java.lang.Array");
	}

	public void m2() throws FileNotFoundException {
		FileInputStream f1 = new FileInputStream("D:\\Notes");
	}

}
