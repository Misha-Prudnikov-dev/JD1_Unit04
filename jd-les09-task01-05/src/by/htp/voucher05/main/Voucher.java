package by.htp.voucher05.main;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Voucher {

	private TypeVoucher typeVoucher;
	private Transport transport;
	private Food food;
	private int cost;
	private int daysOfStay;
	private Date date;
	private String country;

	public Voucher(TypeVoucher typeVoucher, Transport transport, Food food, int cost, int daysOfStay, Date date,
			String country) {
		this.typeVoucher = typeVoucher;
		this.transport = transport;
		this.food = food;
		this.cost = cost;
		this.daysOfStay = daysOfStay;
		this.date = date;
		this.country = country;
	}

	public TypeVoucher getTypeVoucher() {
		return typeVoucher;
	}

	public void setTypeVoucher(TypeVoucher typeVoucher) {
		this.typeVoucher = typeVoucher;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDaysOfStay() {
		return daysOfStay;
	}

	public void setDaysOfStay(int daysOfStay) {
		this.daysOfStay = daysOfStay;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + daysOfStay;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((typeVoucher == null) ? 0 : typeVoucher.hashCode());
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
		Voucher other = (Voucher) obj;
		if (cost != other.cost)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (daysOfStay != other.daysOfStay)
			return false;
		if (food != other.food)
			return false;
		if (transport != other.transport)
			return false;
		if (typeVoucher != other.typeVoucher)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Voucher [typeVoucher=" + typeVoucher + ", transport=" + transport + ", food=" + food + ", cost=" + cost
				+ ", daysOfStay=" + daysOfStay + ", date=" + date + ", country=" + country + "]";
	}

}
