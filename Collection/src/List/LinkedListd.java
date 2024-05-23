package List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListd {

		public static void main(String[] args) {

			Object obj[] = new Object[1000000];
			
			for(int i =0;i<obj.length;i++) {
				obj[i]=new Object();
			}
			
			List<Object> list = new ArrayList<Object>();
			long a = System.currentTimeMillis();
			for(Object i: obj) {
				list.add(i);
			}
			long b = System.currentTimeMillis();
			System.out.print(b-a);
		}

	
}
