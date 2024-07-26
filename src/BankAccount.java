import java.math.BigInteger;

public class BankAccount{
    private BigInteger accountNumber;
    private double balance;
    String owner;

    public double getBalance() {
        return balance;
    }

    public BigInteger getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(BigInteger accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Деньги зачислены. Баланс: " + this.balance);
    }

    public void withdraw(double amount){
        try{
            validateAmount(this.balance, amount);
            this.balance -= amount;
            System.out.println("Операция успешно проведена");
        }catch (InvalidAmountException e){
            System.out.println(e.getMessage());
        }
    }

    private static void validateAmount(double balance, double amount) throws InvalidAmountException{
        if (balance - amount < 0){
            throw new InvalidAmountException("Недостаточно средств");
        }
    }
}
