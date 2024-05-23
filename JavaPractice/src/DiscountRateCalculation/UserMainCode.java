package DiscountRateCalculation;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
public class UserMainCode {

	public static ArrayList<String> calculateDiscount(Map<String,String> map,Map<String,Integer> map2){
		ArrayList<String> list = new ArrayList<>();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate l1 = LocalDate.parse("01-01-2015",df);
		int syr = l1.get(ChronoField.YEAR);
		double dis=0;
		for(String i: map.keySet()) {
			for(String j: map2.keySet()) {
				if(i.equals(j)) {
					int a= LocalDate.parse(map.get(i),df).get(ChronoField.YEAR);
					if(map2.get(j)>=20000) {
						if(syr-a>=5) {
							dis = map2.get(j)*.20;
							list.add(j+":"+(int)dis);
						}
						else if(syr-a<5) {
							dis = map2.get(j)*.10;
							list.add(j+":"+(int)dis);
						}
					}
					else if(map2.get(j)<20000) {
						if(syr-a>=5) {
							dis = map2.get(j)*.15;
							list.add(j+":"+(int)dis);
						}
						else if(syr-a<5) {
							dis = map2.get(j)*.05;
							list.add(j+":"+(int)dis);
						}
					}
				}
			}
		}
//		int syr2[] = new int[map.size()];
//		int a=0;
//		for(String s: map.keySet()) {
//			syr2[a]=LocalDate.parse(map.get(s),df).get(ChronoField.YEAR);
//			a++;
//		}
//		int b=0;
//		double dis=0;
//		for(String s: map2.keySet()) {
//			if(map2.get(s)>=20000) {
//				if(syr-syr2[b]>=5) {
//					dis = map2.get(s)*.20;
//					list.add(s+":"+(int)dis);
//				}
//				else if(syr-syr2[b]<5) {
//					dis = map2.get(s)*.10;
//					list.add(s+":"+(int)dis);
//				}
//			}
//			else if(map2.get(s)<20000) {
//				if(syr-syr2[b]>=5) {
//					dis = map2.get(s)*.15;
//					list.add(s+":"+(int)dis);
//				}
//				else if(syr-syr2[b]<5) {
//					dis = map2.get(s)*.5;
//					list.add(s+":"+(int)dis);
//				}
//			}
//			b++;
//		}
		
		return list;
	}
}
