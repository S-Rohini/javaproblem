class Employee
{

	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
        final double specialAllowance =250.80;
	final double hra=1000.50;
	
	public Employee(long id, String Name, String Address, long Phone,double basicSalary)
	{
		this.employeeId=id;
		this.employeeName=Name;
		this.employeeAddress=Address;
		this.employeePhone=Phone;
        this.basicSalary=basicSalary;
	}
	public void calculateSalary()
	{
		double salary;
		salary=basicSalary + ( basicSalary * specialAllowance/100 ) + ( basicSalary * hra/100 );
		System.out.println("Calculated Salary:"+salary);
	}
}
class Manager extends Employee
{



	public Manager( long Id,String Name, String Address,long Phone,double basicSalary) 
	{
		super(Id,Name,Address,Phone,basicSalary);
		
	}

}
class Trainee extends Employee
{

	public Trainee(long id, String Name, String Address, long Phone, double basicSalary)
	{
		super(id, Name, Address, Phone, basicSalary);
		
	}
	
}
public class Inheritancectivity {

	public static void main(String[] args) 
	{
		Manager m=new Manager(1243, "peter", "chennai india", 14345,65000);
                Trainee t=new Trainee(29846, "jack", "mumbai india", 442085,45000); 
		m.calculateSalary();
                t.calculateSalary();
		
	}

}