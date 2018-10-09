import javax.swing.*;

public class BankAccount {

    private String accnum;
    private double balance;
    private Person customer;

    public void setAccnum(String accnum)
    {
        this.accnum = accnum;
    }

    public String getAccnum()
    {
        return accnum;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setCustomer(Person customer)
    {
        this.customer = customer;
    }

    public Person getCustomer()
    {
        return customer;
    }

    public BankAccount()
    {
        accnum = "No Account Number";
        balance = 0;
        customer = new Person();
    }

    public BankAccount(String accnum, double balance, Person customer)
    {
        this.accnum = accnum;
        this.balance = balance;
        this.customer = customer;
    }

  /*  public String toString()
    {
        return "\nAccount Number: " + getAccnum() +
                "\nBalance: " + getBalance() +
                "\nAccount Holder: " + customer.getName();
    }*/

    public void lodgeMoney()
    {
        double lodgement, bal, total;
        bal = getBalance();
        lodgement = Double.parseDouble(JOptionPane.showInputDialog("How much money are you entering"));
        total = lodgement + bal;
        setBalance(total);
    }

    public void withdrawMoney()
    {
        double withdraw, bal, total;
        bal = getBalance();
        withdraw = Double.parseDouble(JOptionPane.showInputDialog("How much money are you withdrawing"));
        total = bal - withdraw;
        setBalance(total);
    }




}
