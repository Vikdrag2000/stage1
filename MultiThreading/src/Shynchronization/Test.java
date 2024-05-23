package Shynchronization;

public class Test {

	public static void main(String[] args) {
	ThreadD d = new ThreadD();
    Thread1 t = new Thread1(d);
    Thread2 t2 = new Thread2(d);
		t.start();
		t2.start();
	}

}
