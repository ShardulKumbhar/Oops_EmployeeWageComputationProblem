package employewage;

class employee6 {
	void monthly() {
		// variable assign
		int empRatePerHr = 20;
		double totalsalary = 0;
		int maxRateInMonth = 100;
		int numOfWorkingDays = 20;
		int totalEmpHr = 0;
		int totalWorkingDays = 0;
		int empHrs = 0;

		// to check maximum rate in month and num of days
		while (totalEmpHr <= maxRateInMonth && totalWorkingDays <= numOfWorkingDays) {
			totalWorkingDays++;
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

			totalEmpHr = totalEmpHr + empHrs;
			System.out.println(totalEmpHr);
		}
		totalsalary = totalEmpHr * empRatePerHr;

		System.out.println("Employee total Salary" + totalsalary);
	}
}

public class UC6 {

	public static void main(String[] args) {
		// creating object
		employee6 r = new employee6();
		// calling methord
		r.monthly();
	}

}
