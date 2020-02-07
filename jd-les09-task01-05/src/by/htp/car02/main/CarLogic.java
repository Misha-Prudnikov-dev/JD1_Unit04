package by.htp.car02.main;

public class CarLogic {

	public void carGo(Car car) {

		if (car.getTank() == true) {

		} else {
			String s = "низкий уровень топлева ";
			Main.print(s);
		}
	}

	public void carRefuel(Car car) {

		if (car.getTank() == false) {
			car.setTank(true);

		}

	}

	public void replaceWheel(Wheel wheel, Car car, int n) {

		Wheel[] newWheel = car.getWheel();
		newWheel[n] = wheel;
		car.setWheel(newWheel);

	}

}
