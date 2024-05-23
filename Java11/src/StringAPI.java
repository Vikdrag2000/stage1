import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringAPI {

	public static void main(String[] args) {

		String str =" ";
		System.out.println(str.isBlank());
		str= "I\nam\na\nEmployee ";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));
		char c = '\u2000';
		str=c+str;
		//System.out.println(str.strip());  // remove blank space from atStart and atEnd only
		System.out.println(str.stripLeading());
		System.out.println(str.stripTrailing());
		
		System.out.println("+".repeat(30));
	}

}
