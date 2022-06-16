import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//List<ProjectManagement> projectDataList = new ArrayList<ProjectManagement>();
		ArrayList<ProjectManagement> projectDataList = new ArrayList<ProjectManagement>();
		ArrayList<Person> contractorList = new ArrayList<Person>();

		Scanner input = new Scanner(System.in);
		
		//project information
		System.out.print("Project Number: ");
		String projectNo = input.nextLine();
		
		System.out.print("Project Name: ");
		String projectName = input.nextLine();

		System.out.print("Deadline (eg. 7 May 2023): ");
		String deadline = input.nextLine();

		System.out.print("Type of Building: ");
		String typeBuilding = input.nextLine();

		System.out.print("Physical Address: ");
		String physicalAddress = input.nextLine();

		System.out.print("ERF Number: ");
		String erfNo = input.nextLine();

		System.out.print("Project Fee: ");
		Double projectFee = input.nextDouble();

		System.out.print("Total Paid: ");
		Double totalPaid = input.nextDouble();
		input.nextLine();
		
		//initialising all the information for the project
		ProjectManagement project = new ProjectManagement(projectNo, projectName, 
				typeBuilding, physicalAddress, erfNo, projectFee, totalPaid, deadline);		
		projectDataList.add(project);
		
		//displaying data
		for (ProjectManagement value: projectDataList) {
			System.out.println(value);
		}
	
		
		//getting new deadline and replacing the old with this one
		System.out.print("New Deadline (eg. 7 May 2023): ");
		String newDeadline = input.nextLine();
		project.setDeadline(newDeadline);

		projectDataList.set(0, (project));
		
		for (ProjectManagement value: projectDataList) {
			System.out.println(value);
		}
		
		//getting the additional fee paid and adding it to current amount
		System.out.print("Additional Fee Paid: ");
		Double newTransaction = input.nextDouble();
		input.nextLine();
		project.setTotalFee(totalPaid + newTransaction);

		projectDataList.set(0, (project));
		
		for (ProjectManagement value: projectDataList) {
			System.out.println(value);
		}
		
		//finalising project
		project.finaliseProject();
		
		//initialising information for a contractor
		//project information
		System.out.println("Enter Contactor Details");
		System.out.print("Name: ");
		String name = input.nextLine();
		
		System.out.print("Phone Number: ");
		String telephoneNo = input.nextLine();

		System.out.print("Email Address: ");
		String emailAddress = input.nextLine();

		System.out.print("Physical Address: ");
		String personPhysicalAddress = input.nextLine();
		
		Person contractor = new Person(name, telephoneNo, emailAddress, personPhysicalAddress);
		contractorList.add(contractor);
		
		for (Person value: contractorList) {
			System.out.println(value);
		}
		
		//getting updated contact details
		System.out.print("New Phone Number: ");
		String newTelephoneNo = input.nextLine();
		contractor.setTelephoneNo(newTelephoneNo);
		System.out.print("New Email Address: ");
		String newEmailAddress = input.nextLine();
		contractor.setEmailAddress(newEmailAddress);
		
		
		contractorList.set(0, (contractor));
		
		for (Person value: contractorList) {
			System.out.println(value);
		}





	}

}
