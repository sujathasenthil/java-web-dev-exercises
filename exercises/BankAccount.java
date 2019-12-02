package exercises;

import java.util.Objects;

public class BankAccount {
    private double balance;
    private int accountNumber;
    private static int nextAccountNumber=1;
    public BankAccount(double balance){
        this.balance=balance;
        this.accountNumber=nextAccountNumber;
        nextAccountNumber++;
    }
    public double getBalance(){
        return this.balance;
    }
    public boolean withdrawal(double amount){
        if ((amount < balance)&&(amount > 0)){
            this.balance= this.balance - amount;
            return true;
        }
        return false;
    }
    public boolean deposit(double amount){
        if(amount >0) {
            this.balance=this.balance+amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNumber == that.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
    public static void main(String args[])
    {
        BankAccount bankAcc=new BankAccount(1000);
        System.out.println((bankAcc));
        boolean isAllowed=bankAcc.withdrawal(100);
        System.out.println(isAllowed);
    }
}
