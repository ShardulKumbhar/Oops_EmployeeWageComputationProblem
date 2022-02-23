package employewage;

class employee4 {
	void partTime() {
		// variable
		int empRatePerHr = 20;
		int empHrs = 0;
		double salary = 0;

		double randomCheck = Math.floor(Math.random() * 10) % 3;
		int i = (int) randomCheck;

		// switch case
		switch (i) {

		case 2:
			System.out.println("Employee is FullTime");
			empHrs = 8;
			break;
		case 1:
			System.out.println("Employee is PartTime");
			empHrs = 4;
			break;
		case 0:
			System.out.println("Employee is Absent");
			empHrs = 0;
			break;
		}
		// print employee salary
		salary = empHrs * empRatePerHr;
		System.out.println("Employee Salary" + salary);
	}
}

public class UC4 {

	public static void main(String[] args) {
		
		//creating object
		employee4 r = new employee4();
		r.partTime();
	}
}