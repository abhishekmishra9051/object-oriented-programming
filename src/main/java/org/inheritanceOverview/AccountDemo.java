package org.inheritanceOverview;

class Account{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String accNo, String name, String address, String phno, String dob, long balance){
        this.accNo= accNo;
        this.name = name;
        this.phno = phno;
        this.address = address;
        this.dob = dob;
        this.balance = balance;
    }

    public String getAccNo(){ return accNo;}
    public String getName(){ return name;}
    public String getPhno(){ return phno;}
    public String getAddress(){ return address;}
    public String getDob(){ return dob;}
    public long getBalance() { return balance;}

    public void setAddress(String address) { this.address = address;}
    public void setPhno(String phno){ this.phno = phno;}
}

class SavingsAccount  extends Account{

    public SavingsAccount(String accNo, String name, String address, String phno, String dob, long balance) {
        super(accNo, name, address, phno, dob, balance);
    }

    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String accNo, String name, String address, String phno, String dob, long balance) {
        super(accNo, name, address, phno, dob, balance);
    }

    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}
public class AccountDemo {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("S001", "Abhishek Mishra", "mohali", "905128xxxx", "29/09/2001", 1000);
        System.out.println("Initial balance: " + savingsAccount.getBalance());

        savingsAccount.deposit(500);
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());

        savingsAccount.withdraw(200);
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());

        LoanAccount loanAccount = new LoanAccount("L001", "Abhishek Mishra", "mohali", "905128xxxx", "29/09/2001", 5000);
        System.out.println("Initial balance: " + loanAccount.getBalance());

        loanAccount.payEMI(1000);
        System.out.println("Balance after paying EMI: " + loanAccount.getBalance());

        loanAccount.repay(5000);
        System.out.println("Balance after full repayment: " + loanAccount.getBalance());
    }
}
