package Cui;
import java.io.*;

import java.io.BufferedReader;

public class Cui {

	public static void main(String[] args)throws IOException{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Please input your name");
		String line = reader.readLine();
		System.out.println("Hello " + line + "!");
	}
}
