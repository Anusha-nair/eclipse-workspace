package TestngPractice;
import org.testng.Assert;
import org.testng.annotations.Test;
public class EmployeeTestng
{
EmployeeLogic empLogic = new EmployeeLogic();
EmployeeDetails employee = new EmployeeDetails();


@Test
public void testCalculations()
{
employee.setName("Repsy");
employee.setAge(27);
employee.setPayment(8000);

double Apprisal = empLogic.calculateApprisal(employee);
System.out.println(Apprisal);

@Test
String Prstatus = empLogic.PrStatus();
}
}