package NewDateTime;
import java.time.*;
public class LocalDtaeTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalTime lt2 = lt.minusHours(2);
		System.out.println(lt2);
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
	
		LocalDateTime ltd = LocalDateTime.now();
		System.out.println(ltd);
	
	}

}
