package Oops.BoundaryAverage;

public class UserMainCode {

	public static float getBoundaryAverage(int[] arr) {
		float min=0;
	    float max=10;
		for(int i: arr) {
			if(i>min) {
				min=i;
			}
			if(i<max) {
				max=i;
			}
		}	
		return (min+max)/2;
	}
}
