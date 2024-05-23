import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FilesAPI {

	public static void main(String[] args) throws IOException{
     Path path2 = Files.writeString(Files.createTempFile("Test", ".txt"),"Java is High Level Language");
		System.out.println(path2);
		String str = Files.readString(path2);
		System.out.println(str);
	}

}
