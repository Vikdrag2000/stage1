import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
		fis = new FileInputStream(new File("C:\\Users\\2317589\\Desktop\\File\\Stream.txt"));
		System.out.println("File Opened");
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.print("\nFile Closed");
		}
	}

}
