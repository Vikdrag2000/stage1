package InterfacePart;

public class MyCircle implements Circle,CircleTwo {

	public static void main(String[] args) {
		MyCircle m = new MyCircle();
		m.Area();
;	}

	@Override
	public void Area() {
		
		System.out.println(CircleTwo.pi);		
	}

	@Override
	public void Area(int r) {
		// TODO Auto-generated method stub
		
	}

}
