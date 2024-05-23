package Checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws3 {

	void method() throws FileNotFoundException{
		 
		FileInputStream fs = new FileInputStream("");
	
}
public static void main(String[] args) throws FileNotFoundException{
 
	Throws3 tr = new Throws3();
	
		tr.method();

}

}
