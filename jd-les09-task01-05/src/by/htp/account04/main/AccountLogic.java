package by.htp.account04.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AccountLogic {

	public void searchAccount(Client c, int n) {

		for (Account a : c.getAccounts()) {

			if (a.getAccountId() == n) {
				Main.printAccount(a);
			}
		}

	}

	public void sortAccountID(Client c) {

		List<Account> result = new ArrayList<Account>();

		result = c.getAccounts();

		Collections.sort(result);
	}

	public int sumAccount(Client c) {

		int sum = 0;
		for (Account a : c.getAccounts()) {

			sum = sum + a.getBalance();
		}
		return sum;
	}

	public int sumNegativeAccount(Client c) {

		int sumNegative = 0;

		for (Account a : c.getAccounts()) {

			if (a.getBalance() < 0) {
				sumNegative = sumNegative + a.getBalance();

			}
		}
		return sumNegative;
	}

	public int sumPositiveAccount(Client c) {

		int sumPositive = 0;

		for (Account a : c.getAccounts()) {

			if (a.getBalance() > 0) {
				sumPositive = sumPositive + a.getBalance();
			}
		}
		return sumPositive;
	}

}
