class class Employee 
{
	int empno;
	String name;
	float sal;


	void setDetails(){

		name = "Praveen";
		sal = 5500f;

	}

	void getDetails(){
		System.out.println(empno +  "  |  " + name +  "  |  " +sal);
	}


}

class ObjectTest1
{
}
	public static void main(String[] args) 
	{
		Employee emp = new Employee();


		System.out.println(emp.empno + "  |  " + emp.name +  " |  " + emp.sal);

		emp.getDetails();

		emp.empno = 101;
		emp.name = " MADHUBABU" ;
		emp.sal = 2500f;

		emp.getDetails();

		emp.setDetails();
		emp.getDetails();




	}

 
 