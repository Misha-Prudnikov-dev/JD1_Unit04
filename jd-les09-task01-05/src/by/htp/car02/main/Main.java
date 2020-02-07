package by.htp.car02.main;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля. */

public class Main {

	public static void main(String[] args) {

		Car car = new Car("Ford", "Blue", 240, false, new Wheel[] { new Wheel(), new Wheel(), new Wheel() },
				new Engine("diesel", 60));

		printBrand(car);

		CarLogic carLog = new CarLogic();

		carLog.carGo(car);

		carLog.carRefuel(car);
		carLog.replaceWheel(new Wheel(21), car, 2);
	}

	public static void printBrand(Car car) {

		System.out.println(car.getBrand());
	}

	public static void print(String s) {

		System.out.println(s);
	}

}
