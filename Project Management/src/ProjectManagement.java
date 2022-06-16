import java.time.LocalDate;
import java.util.List;

public class ProjectManagement {
	
	private String projectNo;
	private String projectName;
	private String typeBuilding;
	private String physicalAddress;
	private String erfNo;
	private Double projectFee;
	private Double totalFeePaid;
	private String deadline;
	
	//constructor
	public ProjectManagement(String projectNo, String projectName, String typeBuilding, String physicalAddress, 
			String erfNo, Double projectFee, Double totalFee, String deadline) {
		
		this.projectNo = projectNo;
		this.projectName = projectName;
		this.typeBuilding = typeBuilding;
		this.physicalAddress = physicalAddress;
		this.erfNo = erfNo;
		this.projectFee = projectFee;
		this.totalFeePaid = totalFee;
		this.deadline = deadline;
		
	}
	
	//tostring method which prints data in format specified
	@Override
	public String toString() {
		return "Project Number: " + projectNo + "\n" + "Project Name: " + projectName + "\n" + "Type Building: "
		+ typeBuilding + "\n" + "Physical Address: " + physicalAddress + "\n" + "ERF Number: " + erfNo + "\n" + "Project Fee: "
		+ projectFee + "\n" + "Total Fee Paid: " + totalFeePaid + "\n" + "Deadline: " + deadline + "\n";
	}

	//creating getters and setters
	public String getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTypeBuilding() {
		return typeBuilding;
	}

	public void setTypeBuilding(String typeBuilding) {
		this.typeBuilding = typeBuilding;
	}

	public String getPhysicalAddress() {
		return physicalAddress;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	public String getErfNo() {
		return erfNo;
	}

	public void setErfNo(String erfNo) {
		this.erfNo = erfNo;
	}

	public Double getProjectFee() {
		return projectFee;
	}

	public void setProjectFee(Double projectFee) {
		this.projectFee = projectFee;
	}

	public Double getTotalFee() {
		return totalFeePaid;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFeePaid = totalFee;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	
	
	//method to finalise a project
	public void finaliseProject() {
		//Pass though project name so details about contractor etc can be found in future
		double leftOver;
		
		if (projectFee == totalFeePaid || totalFeePaid > projectFee) {
			LocalDate todaysDate = LocalDate.now();
			System.out.println("Project Fee already paid. Project marked as completed.");
		}
		else if (projectFee > totalFeePaid) {
			leftOver = projectFee - totalFeePaid;
			System.out.println("Fee still to be paid: " + leftOver);
		}
		else {
			System.out.print("Error!");
		}
	}
	

}
