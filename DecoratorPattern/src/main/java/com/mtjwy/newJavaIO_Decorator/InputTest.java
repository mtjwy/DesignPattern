package com.mtjwy.newJavaIO_Decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;



public class InputTest {
	public static void main(String[] args) throws IOException {
		int c = 0;
		InputStream in = new LowerCaseInputStream(
				new BufferedInputStream(
						new FileInputStream("./testData/test.txt")));
		while((c = in.read()) >= 0) {
			System.out.print((char) c);
		}
		in.close();
	}
}
