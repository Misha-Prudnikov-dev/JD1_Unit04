package by.htp.voucher05.main;

import java.util.Comparator;

public class VoucherCostComparator implements Comparator<Voucher> {

	@Override
	public int compare(Voucher o1, Voucher o2) {

		int cost1 = o1.getCost();
		int cost2 = o2.getCost();

		return cost1 - cost2;
	}

}
