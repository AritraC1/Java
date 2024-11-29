package Projects.BankAccountManagementSystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private String type;
    private double amount;
    private String date;
    private String remarks;

    public Transaction(String type, double amount, String date, String remarks) {
        this.type = type;
        this.amount = amount;
        this.remarks = remarks;
        this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    @Override
    public String toString() {
        return "[" + date + "] " + type + ": $" + amount + " - " + remarks;
    }
}
