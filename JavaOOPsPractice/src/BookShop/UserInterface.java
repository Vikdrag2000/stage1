package BookShop;
import java.util.*;
public class UserInterface {
   
	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     String str = sc.nextLine();
     Book ob = extractDetails(str);
		double b = ob.calculateBookCost();
		if(b>0) {
		System.out.println("Book Details");
		System.out.println("Book Name : "+ob.getBookName());
		System.out.println("Author Name : "+ob.getAuthorName());
		System.out.println("Published Year : "+ob.getPublishedYear());
		System.out.printf("Book Cost : %.1f",b);
		}else {
			System.out.println("Invalid book details");	
		}
	}
	public static Book extractDetails(String bookDetails) {
		String[] arr = bookDetails.split(":");
		Book obj = new Book(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
		return obj;
		
	}
}
