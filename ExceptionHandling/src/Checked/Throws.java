package Checked;
import java.io.*;

public class Throws {
	
	void method() {
		try {
			FileInputStream fs = new FileInputStream("");
		} catch (FileNotFoundException e) {
			System.out.print("File Not Found");
		}
	}

	public static void main(String[] args) {
      Throws tr = new Throws();
      tr.method();
		
	}

}
