package employewage;

class employee {

	// methord
	void check() {
		int isPresent = 1;
		int salary;
		int empRatePerHr = 20;
		int workinghr;
		double randomCheck = Math.floor(Math.random() * 10) % 2;

		if (isPresent == randomCheck) {
			System.out.println("Employee is present");
			workinghr = 8;
		} else {
			System.out.println("Employee is Absent");
			workinghr = 0;
		}

		salary = empRatePerHr * workinghr;
		System.out.println("Employee daily wage" + salary);
	}

}

public class UC2 {

	public static void main(String[] args) {
		// creating object
		employee r = new employee();
		//calling object through methord
		r.check();
	}
}