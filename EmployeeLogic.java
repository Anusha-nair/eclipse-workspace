package TestngPractice;

public class EmployeeLogic
{
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
    double yearlySalary= 0;
    yearlySalary = employeeDetails.getPayment() *12;
    
    return yearlySalary;

}
	int apprisal = 0;
	public double calculateApprisal(EmployeeDetails employeeDetails)
		{
		if (employeeDetails.getAge()<=50)
		{
			
			double calculateApprisal = employeeDetails.getPayment()*250;
			return calculateApprisal;
					
		}
		
		else
		{
			double calculateApprisal = employeeDetails.getPayment()*500;
			return calculateApprisal;
		}
		}
	
		}
	
	
	
