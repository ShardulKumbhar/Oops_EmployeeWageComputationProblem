package employewage;

class employee6 {
	void monthly() {
		// variable assigne
		int empRatePerHr = 20;
		double totalsalary = 0;
		double salary = 0;
		int numofworkingDays = 20;
		int empHrs = 0;
		int day = 1;

		for (day = 1; day <= numofworkingDays; day++) {

			double randomCheck = Math.floor(Math.random() * 10) % 3;
			int i = (int) randomCheck;
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

			salary = empHrs * empRatePerHr;
			totalsalary = totalsalary + salary;
			System.out.println("Employee this month Salary :" + totalsalary);
		}
	}
}

public class UC5 {

	public static void main(String[] args) {
		// creating object
		employee6 r = new employee6();
		// calling object by methord
		r.monthly();
	}

}