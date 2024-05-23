
public class ImmutableClass {
	int x;
	public ImmutableClass(int x) {
		this.x=x;
	}
	public ImmutableClass change(int x) {
		if(this.x==x) {
			return this;
		}
		else {
			return new ImmutableClass(x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ImmutableClass m1 = new ImmutableClass(20);
      ImmutableClass m2 = m1.change(20);
      System.out.println(m1==m2);
      ImmutableClass m3 = m1.change(29);
      System.out.println(m1==m3);
	}

}
