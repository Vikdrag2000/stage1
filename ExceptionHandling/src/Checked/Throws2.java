package Checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.TransferHandler;

public class Throws2 {

	void method() throws FileNotFoundException{
		 
			FileInputStream fs = new FileInputStream("");
		
	}
	public static void main(String[] args) {
     
		Throws2 tr = new Throws2();
		try {
			tr.method();
		} catch (FileNotFoundException e) {
			System.out.print("File not Find");
		}
	}

}
