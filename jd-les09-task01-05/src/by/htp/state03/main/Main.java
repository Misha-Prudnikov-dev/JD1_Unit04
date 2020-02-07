package by.htp.state03.main;

/*
 * 3.Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, 
 * площадь, областные центры.
 */

public class Main {

	public static void main(String[] args) {

		State state = new State();

		Region region1 = new Region("Brestskaya", 32787, 1380391);
		Region region2 = new Region("Vitebskaya", 40051, 1171523);
		Region region3 = new Region("Gomelskaya", 40372, 1409890);
		Region region4 = new Region("Grodnenskaya", 25127, 1039278);
		Region region5 = new Region("Minskaya", 39854, 1428530);
		Region region6 = new Region("Mogilevskaya", 29068, 1052877);

		region1.add(new Area(new City("Brest", 343985, 146), "Brestskiy", 1544, 42400));
		region2.add(new Area(new City("Vitebsk", 378459, 134), "Vitebskiy", 2737, 37051));
		region3.add(new Area(new City("Gomel", 535693, 139), "Gomelskiy", 1951, 68306));
		region4.add(new Area(new City("Grodno", 373547, 142), "Grodnenskiy", 2594, 49803));
		region5.add(new Area(new City("Minsk", 1992685, 348), "Minskiy", 1902, 215404));
		region6.add(new Area(new City("Mogilev", 380440, 118), "Mogilevskiy", 1895, 40230));

		state.add(region1);
		state.add(region2);
		state.add(region3);
		state.add(region4);
		state.add(region5);
		state.add(region6);

		printInfo(state);
	}

	public static void printInfo(State state) {

		System.out.println("Столица: " + state.getCapital().getName());
		System.out.println("Площадь страны : " + state.getSquare());
		System.out.println("Количество областей : " + state.getRegions().size());
		System.out.println(" ");

		for (Region t : state.getRegions()) {
			for (Area a : t.getAreas()) {

				System.out.println("Областные центры : " + a.getCity().getName());

			}
		}
	}

}
