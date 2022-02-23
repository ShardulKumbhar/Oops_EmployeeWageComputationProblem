package employewage;

class Company {

	// methord creation
	void check(int x, int y) {
		int empRatePerHr = x;
		double totalsalary = 0;
		int maxRateInMonth = 100;
		int numOfWorkingDays = y;
		int totalEmpHr = 0;
		int totalWorkingDays = 0;
		int empHrs = 0;

		while (totalEmpHr <= maxRateInMonth && totalWorkingDays <= numOfWorkingDays) {
			totalWorkingDays++;
			double randomCheck = Math.floor(Math.random() * 10) % 3;
			int i = (int) randomCheck;
			switch (i) {
			case 2:
				// System.out.println("Employee is FullTime");
				empHrs = 8;
				break;
			case 1:
				// System.out.println("Employee is PartTime");
				empHrs = 4;
				break;
			case 0:
				// System.out.println("Employee is Absent");
				empHrs = 0;
				break;
			}

			totalEmpHr = totalEmpHr + empHrs;
			// System.out.println(totalEmpHr);
		}
		totalsalary = totalEmpHr * empRatePerHr;

		System.out.println("\nEmployee total Salary\n" + totalsalary);
	}
}

public class UC8MC {

	public static void main(String[] args) {

		// creating object

		Company tcs = new Company();
		System.out.print("\nemployee wages for tcs");
		// calling methord in object
		tcs.check(8, 20); // (empRatePerHr,totalWorkingDays)

		System.out.print("\nemployee wages for Infosys");
		Company infosys = new Company();// object2
		infosys.check(10, 22);

		System.out.print("\nemployee wages for Mahindra");
		Company mahindra = new Company();// object3
		mahindra.check(50, 100);

	}
}
