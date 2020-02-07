package by.htp.voucher05.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VoucherListLogic {

	public List<Voucher> getListTypeVoucher(VoucherList voucherList, TypeVoucher type) {

		List<Voucher> result = new ArrayList<Voucher>();

		for (Voucher v : voucherList.getVouchers()) {

			if (v.getTypeVoucher() == type) {

				result.add(v);
			}
		}

		return result;
	}

	public List<Voucher> getListTransport(VoucherList voucherList, Transport t) {

		List<Voucher> result = new ArrayList<Voucher>();

		for (Voucher v : voucherList.getVouchers()) {

			if (v.getTransport() == t) {

				result.add(v);
			}
		}

		return result;
	}

	public List<Voucher> getListMonth(VoucherList voucherList, String m) {

		List<Voucher> result = new ArrayList<Voucher>();

		for (Voucher v : voucherList.getVouchers()) {

			if (v.getDate().getMonth().equals(m)) {

				result.add(v);
			}
		}

		return result;
	}

	public void sortDay(VoucherList voucherList) {
		Collections.sort(voucherList.getVouchers(), new VoucherDaysOfStayComparator());
	}

	public void sortCost(VoucherList voucherList) {
		Collections.sort(voucherList.getVouchers(), new VoucherCostComparator());
	}

}
