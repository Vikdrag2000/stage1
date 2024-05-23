package TheSpiceSensation;

public class Spice {

	String spiceName;
	String origin;
	int spiceRating;
	String color;
	int shelfLifeInMonths;
	
	public Spice(String spiceName,String origin,int spiceRating,String color,int shelfLifeInMonths) {
		
		this.spiceName=spiceName;
		this.origin=origin;
		this.spiceRating=spiceRating;
		this.color=color;
		this.shelfLifeInMonths=shelfLifeInMonths;
	}

	public String findSpiceLevel() {
		if(shelfLifeInMonths>0) {
			if(spiceRating>=1 && spiceRating<4) {
				return "Mild";
			}
			else if(spiceRating>=4 && spiceRating<7) {
				return "Medium";
			}
			else if(spiceRating>=7 && spiceRating<=9) {
				return "Hot";
			}
		}
		return "Error";
	}
}
