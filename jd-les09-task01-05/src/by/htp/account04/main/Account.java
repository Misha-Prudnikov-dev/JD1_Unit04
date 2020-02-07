package by.htp.account04.main;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Account implements Comparable<Account> {

	private int accountId;
	private int balance;
	private boolean blocking;

	public Account() {
		accountId = 0;
		balance = 0;
		blocking = false;
	}

	public Account(int accountId, int balance, boolean blocking) {
		this.accountId = accountId;
		this.balance = balance;
		this.blocking = blocking;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean getBlocking() {
		return blocking;
	}

	public void setBlocking(boolean blocking) {
		this.blocking = blocking;
	}

	@Override
	public int compareTo(Account o) {

		if (this.accountId < o.accountId) {

			return -1;
		} else if (this.accountId > o.accountId) {
			return 1;
		}

		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountId;
		result = prime * result + balance;
		result = prime * result + (blocking ? 1231 : 1237);
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
		Account other = (Account) obj;
		if (accountId != other.accountId)
			return false;
		if (balance != other.balance)
			return false;
		if (blocking != other.blocking)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [ accountId = " + accountId + ", balance = " + balance + ", blocking = " + blocking + " ]";
	}

}
