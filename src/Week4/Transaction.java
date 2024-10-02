package Week4;

public class Transaction {
    /**
     * An especially short bit of Javadoc.
     */
    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * An especially short bit of Javadoc.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    public String getOperation() {
        return operation;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
