package by.htp.voucher05.main;

import java.util.Collections;
import java.util.List;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {

	public static void main(String[] args) {

		VoucherList voucherList = new VoucherList();

		Voucher voucher1 = new Voucher(TypeVoucher.CRUISE, Transport.BUS, Food.BREAKFAST, 1420, 7,
				new Date(2020, "February", 3, 12, 10), "France");
		Voucher voucher2 = new Voucher(TypeVoucher.EXCURSION, Transport.PLANE, Food.DINNER, 1210, 14,
				new Date(2020, "March", 2, 11, 15), "USA");
		Voucher voucher3 = new Voucher(TypeVoucher.RELAXATION, Transport.TRAIN, Food.LUNCH, 1000, 3,
				new Date(2020, "April", 5, 14, 10), "Gemany");
		Voucher voucher4 = new Voucher(TypeVoucher.SHOPPING, Transport.PLANE, Food.FULL, 1700, 10,
				new Date(2020, "May", 4, 10, 10), "England");
		Voucher voucher5 = new Voucher(TypeVoucher.TREATMENT, Transport.BUS, Food.LUNCH, 1400, 6,
				new Date(2020, "October", 1, 13, 10), "Belarus");

		voucherList.add(voucher1);
		voucherList.add(voucher2);
		voucherList.add(voucher3);
		voucherList.add(voucher4);
		voucherList.add(voucher5);

		VoucherListLogic voucherListLog = new VoucherListLogic();

		print(voucherList);

		List<Voucher> getListTypeVoucher = voucherListLog.getListTypeVoucher(voucherList, TypeVoucher.EXCURSION);

		printList(getListTypeVoucher);

		List<Voucher> getListTransport = voucherListLog.getListTransport(voucherList, Transport.TRAIN);

		printList(getListTransport);

		List<Voucher> getListMonth = voucherListLog.getListMonth(voucherList, "February");

		printList(getListMonth);

		voucherListLog.sortDay(voucherList);

		print(voucherList);

		voucherListLog.sortCost(voucherList);

		print(voucherList);

	}

	public static void print(VoucherList voucherList) {

		for (Voucher v : voucherList.getVouchers()) {

			System.out.println("Тип путевки " + v.getTypeVoucher() + ", Транспорт  " + v.getTransport() + ", Питание "
					+ v.getFood() + ", Стоймость  " + v.getCost() + ", число дней проживание " + v.getDaysOfStay()
					+ ", Дата отправления( год " + v.getDate().getYear() + ", месяц " + v.getDate().getMonth()
					+ ", число " + v.getDate().getDay() + ",  " + v.getDate().getHour() + " час "
					+ v.getDate().getMinute() + " мин), Страна  " + v.getCountry());
		}

		System.out.println();
	}

	public static void printList(List<Voucher> voucher) {

		for (Voucher v : voucher) {
			System.out.println("Тип путевки " + v.getTypeVoucher() + ", Транспорт  " + v.getTransport() + ", Питание "
					+ v.getFood() + ", Стоймость  " + v.getCost() + ", число дней проживание " + v.getDaysOfStay()
					+ ", Дата отправления( год " + v.getDate().getYear() + ", месяц " + v.getDate().getMonth()
					+ ", число " + v.getDate().getDay() + ",  " + v.getDate().getHour() + " час "
					+ v.getDate().getMinute() + " мин), Страна  " + v.getCountry());
		}
		System.out.println();
	}

}
