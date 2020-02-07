package by.htp.voucher05.main;

import java.util.Comparator;

public class VoucherDaysOfStayComparator implements Comparator<Voucher>{

	@Override
	public int compare(Voucher o1, Voucher o2) {

		int d1 = o1.getDaysOfStay();
		int d2 = o2.getDaysOfStay();
		
		return d1-d2;
	}

	
}
