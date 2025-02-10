package bankapp;

public class Account {
    private int balance;
    private String pin;
    private String firstName;
    private String lastName;
    private int accountNumber;

    public Account(String firstName, String lastName, int accountNumber, String pin) {
        if (firstName == null || lastName == null)
            throw new NullPointerException("firstName and lastName cannot be null");
        if (accountNumber < 0)
            throw new IllegalArgumentException("accountNumber cannot be negative");
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }
    public Account(){
    }

    public int checkBalance(String pin) {
        //this.pin = pin;
        return balance;
    }
    public void withdraw(int amount, String pin) {
       // try {
            if (amount < 0)
                throw new IllegalArgumentException("Insufficient balance");
            if (balance == 0 || amount > balance)
                throw new IllegalArgumentException("Insufficient balance");
        //} /*catch (IllegalArgumentException exception) {
        //    System.out.println(exception.getMessage());
        //}*/
        if (amount <= balance)
            balance = balance - amount;
    }
    public void deposit(int amount) {
        balance = balance + amount;
    }
    public void updatePin(String newPin, String oldPin) {
        if (pin.equals(oldPin))
            pin = newPin;
        if (!pin.equals(newPin))
            throw new IllegalArgumentException("Wrong pin");
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
