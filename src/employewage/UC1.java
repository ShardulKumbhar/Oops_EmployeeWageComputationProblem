package employewage;

class employee1 {

	// methord
	void check() {
		int IsFullTime = 1;

		double empCheck = Math.floor(Math.random() * 10) % 2;

		// Equation check is present or not
		if (empCheck == IsFullTime) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}

public class UC1 {

	public static void main(String[] args) {

		// calling Object
		employee1 r = new employee1();
		r.check();

	}

}
