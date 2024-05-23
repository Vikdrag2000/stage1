package HireYourGrade;
import java.time.*;
public class Recruitment {

	private String recruitmentId;
	private String companyName;
	private String jobTitle;
	private LocalDate dateOfPost;
	public String getRecruitmentId() {
		return recruitmentId;
	}
	public void setRecruitmentId(String recruitmentId) {
		this.recruitmentId = recruitmentId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public LocalDate getDateOfPost() {
		return dateOfPost;
	}
	public void setDateOfPost(LocalDate dateOfPost) {
		this.dateOfPost = dateOfPost;
	}
	
	 public double calculatePackageReceived () {
		 double d=0;
		 if(companyName.equalsIgnoreCase("Sandisc")) {
			 if(jobTitle.equalsIgnoreCase("JuniorSoftwareDeveloper")) {
				 return 21000+1200;
			 }
			 else if(jobTitle.equalsIgnoreCase("SoftwareDeveloper")) {
				 return 27000+1450;
			 }
			 else if(jobTitle.equalsIgnoreCase("TechnicalHead")) {
				 return 40000+1600;
			 }
			 else if(jobTitle.equalsIgnoreCase("ProjectManager")) {
				 return 45000+1750;
			 }
			 else if(jobTitle.equalsIgnoreCase("ProductManager")) {
				 return 55000+1800;
			 }
		 }
		 return 0;
	 }
	public Recruitment(String recruitmentId, String companyName, String jobTitle, LocalDate dateOfPost) {
		super();
		this.recruitmentId = recruitmentId;
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.dateOfPost = dateOfPost;
	}

}
