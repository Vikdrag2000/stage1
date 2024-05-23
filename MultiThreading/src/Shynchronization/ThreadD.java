package Shynchronization;

public class ThreadD {

	synchronized void display(String a) {
		char c[] = a.toCharArray();
		for(char i:c) {
			System.out.print(i);
		}
	}
}
