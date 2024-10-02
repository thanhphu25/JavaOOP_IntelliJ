package Week4;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {
    /**
     * An especially short bit of Javadoc.
     */
    private double balance;
    private java.util.ArrayList<Transaction> transitionList;

    /**
     * An especially short bit of Javadoc.
     */
    public Account() {
        this.balance = 0;
        this.transitionList = new ArrayList<>();
    }

    /**
     * An especially short bit of Javadoc.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            this.balance += amount;
            transitionList.add(new Transaction(Transaction.DEPOSIT, amount, this.balance));
        }
    }

    /**
     * An especially short bit of Javadoc.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            this.balance -= amount;
            transitionList.add(new Transaction(Transaction.WITHDRAW, amount, this.balance));
        }
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void printTransaction() {
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction current = transitionList.get(i);
            String operation = current.getOperation().equals(Transaction.DEPOSIT)
                    ? "Nap tien" : "Rut tien";
            System.out.println(
                    "Giao dich " + (i + 1) + ": " + operation + " $"
                            + df.format(current.getAmount()) + ". So du luc nay: $"
                            + df.format(current.getBalance()) + "."
            );
        }
    }
}
