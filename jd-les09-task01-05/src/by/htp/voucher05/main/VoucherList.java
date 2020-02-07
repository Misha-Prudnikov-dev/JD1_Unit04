package by.htp.voucher05.main;

import java.util.ArrayList;
import java.util.List;

public class VoucherList {

	private List<Voucher> vouchers;

	public VoucherList() {
		setVouchers(new ArrayList<Voucher>());
	}

	public void add(Voucher newVoucher) {
		vouchers.add(newVoucher);
	}

	public List<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vouchers == null) ? 0 : vouchers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VoucherList other = (VoucherList) obj;
		if (vouchers == null) {
			if (other.vouchers != null)
				return false;
		} else if (!vouchers.equals(other.vouchers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VoucherList [ vouchers = " + vouchers + " ]";
	}

}
