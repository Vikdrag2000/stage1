package Checked;
import java.io.*;

public class CheckedDemo {

	public static void main(String[] args) {

	try {
		FileInputStream fis = new FileInputStream("");
	} catch (FileNotFoundException e) {
		System.out.print("File not Found");
	}
	
	}

}
