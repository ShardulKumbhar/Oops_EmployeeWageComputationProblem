package employewage;

class employee3 {
	void disp() {

		// variable decleration
		int isPartTime = 1;
		int isFullTime = 2;
		int empRatePerHr = 20;
		int empHrs;
		int salary;

		// radiom to check wether full time or parttime
		double randomCheck = Math.floor(Math.random() * 10) % 3;

		if (isFullTime == randomCheck) {
			System.out.println("Employee is FullTime");
			empHrs = 8;
		} else if (isPartTime == randomCheck) {
			System.out.println("Employee is PartTime");
			empHrs = 4;
		} else {
			System.out.println("Employee is Absent");
			empHrs = 0;
		}
		salary = empHrs * empRatePerHr;
		System.out.println("Employee Salary" + salary);
	}
}

public class UC3 {

	// creating object
	public static void main(String[] args) {
		employee3 r = new employee3();
		// calling object through methord
		r.disp();
	}
}
