package EliteConstruction;
//import java.sql.Date;
import java.time.*;
public class ProjectInfo {
	private String projectId;
	private String constructionType;
	private int totalSquareFeet;
	private LocalDate dateOfRegistration;
	private LocalDate dateOfCompletion;
	public ProjectInfo(String projectId, String constructionType, int totalSquareFeet, LocalDate dateOfRegistration,
			LocalDate dateOfCompletion) {
		super();
		this.projectId = projectId;
		this.constructionType = constructionType;
		this.totalSquareFeet = totalSquareFeet;
		this.dateOfRegistration = dateOfRegistration;
		this.dateOfCompletion = dateOfCompletion;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getConstructionType() {
		return constructionType;
	}
	public void setConstructionType(String constructionType) {
		this.constructionType = constructionType;
	}
	public int getTotalSquareFeet() {
		return totalSquareFeet;
	}
	public void setTotalSquareFeet(int totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}
	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public LocalDate getDateOfCompletion() {
		return dateOfCompletion;
	}
	public void setDateOfCompletion(LocalDate dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}
	public double calculateAmountToBePaid() {
		double c =0;
		if(totalSquareFeet>0) {
			if(constructionType.equalsIgnoreCase("WoodFrame")) {
				return totalSquareFeet*1200;
			}
			else if(constructionType.equalsIgnoreCase("LightGaugeSteel")) {
				return totalSquareFeet*850;
			}
			else if(constructionType.equalsIgnoreCase("SteelFrame")) {
				return totalSquareFeet*900;
			}
			else if(constructionType.equalsIgnoreCase("ConcreteFrame")) {
				return totalSquareFeet*750;
			}
			else if(constructionType.equalsIgnoreCase("PreEngineered")) {
				return totalSquareFeet*1300;
			}
			
		}
		return 0;
	}
}


