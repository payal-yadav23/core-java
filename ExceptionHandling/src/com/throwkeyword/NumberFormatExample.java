package com.throwkeyword;

public class NumberFormatExample extends NumberFormatException {

	public NumberFormatExample(String msg) {
		super(msg);
	}

	public void checkException() throws NumberFormatExample {
		String str = "abc123";
		try {

			int num = Integer.parseInt(str);
			System.out.println(num);
		} catch (NumberFormatException e) {
			throw new NumberFormatExample("invalid number format: " + str);
		}

	}

	public static void main(String[] args) {
		NumberFormatExample nf = new NumberFormatExample("");
		try {
			nf.checkException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
