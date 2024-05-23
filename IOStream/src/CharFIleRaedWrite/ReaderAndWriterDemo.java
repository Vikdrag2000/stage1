package CharFIleRaedWrite;
import java.io.*;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws Exception{

		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader("C:\\Users\\2317589\\Desktop\\File\\Stream.txt");
		fw = new FileWriter("C:\\Users\\2317589\\Desktop\\File\\NewText.txt");
		int ch;
		
		while((ch = fr.read())!=-1) {
			fw.write(ch);
		}
		
		fr.close();
		fw.close();
	}

}
