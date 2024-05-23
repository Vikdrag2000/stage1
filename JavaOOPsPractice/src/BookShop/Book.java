package BookShop;

public class Book {

	private String bookName;
	private String authorName;
	private int publishedYear;
	private double cost;
	
	public String getBookName() {
		return bookName;
	}
	public void seetBookName(String s) {
		this.bookName= s;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String s) {
		this.authorName=s;
	}
	
	public int  getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int s) {
		this.publishedYear=s;
	}
	
	public double  getCost() {
		return cost;
	}
	public void setCost(double s) {
		this.cost=s;
	}
	
	public Book(String bookName,String authorName,int publishedYear,double cost) {
		this.bookName=bookName;
		this.authorName=authorName;
		this.publishedYear=publishedYear;
		this.cost=cost;
	}
	
	public double calculateBookCost() {
		double dis=0;
		if(cost>0) {
			if(publishedYear>=1900 && publishedYear<=1940) {
				dis= cost*.25;
				return (cost-dis);
			}
			else if(publishedYear>=1941 && publishedYear<=1980) {
				dis = cost*.35;
				return (cost-dis);
			}
			else if(publishedYear>=1981 && publishedYear<=2020) {
				dis = cost*.15;
				return (cost-dis);
			}
			else {
				return 0;
			}
		}
		return 0;
	}
}
