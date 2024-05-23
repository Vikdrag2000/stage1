package ToString;

public class Parent {
    int a;
    
    @Override
    public String toString() {  //To String Override its own method gives value of the method
    	return "Value="+a;
    }
}
