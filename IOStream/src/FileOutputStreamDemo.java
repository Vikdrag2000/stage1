import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\2317589\\Pictures\\"
					+ "Camera Roll\\WIN_20231227_09_15_36_Pro.jpg");
			fos = new FileOutputStream("C:\\Users\\2317589\\Pictures\\"
					+ "Camera Roll\\Vikash&Joshi.jpg");
			int data;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("File Copied");
		}
	}

}
