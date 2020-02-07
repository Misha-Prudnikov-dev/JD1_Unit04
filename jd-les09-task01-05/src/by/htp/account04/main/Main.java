package by.htp.account04.main;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {

	public static void main(String[] args) {

		int sum = 0;
		int n = 3333;

		AccountLogic bL = new AccountLogic();

		Client client1 = new Client("Masha");

		client1.add(new Account(4444, -100, false));
		client1.add(new Account(5555, 500, false));
		client1.add(new Account(3333, 50, false));

		print(client1);

		bL.searchAccount(client1, n);

		bL.sortAccountID(client1);

		print(client1);

		sum = bL.sumAccount(client1);

		printSum(sum);

		sum = bL.sumNegativeAccount(client1);
		printSum(sum);
		sum = bL.sumPositiveAccount(client1);
		printSum(sum);

	}

	public static void print(Client c) {

		for (Account a : c.getAccounts()) {

			System.out.println("ID " + a.getAccountId() + ", Balance  " + a.getBalance() + ", Client Account : name "
					+ c.getName());

		}
		System.out.println();
	}

	public static void printAccount(Account a) {

		System.out.println("ID account " + a.getAccountId() + ", Balance  " + a.getBalance());

		System.out.println();
	}

	public static void printSum(int sum) {

		System.out.println(sum);
	}

}
