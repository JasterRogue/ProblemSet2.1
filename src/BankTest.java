import javax.swing.*;

public class BankTest {
    public static void main(String[] args)
    {
        BankAccount acc;
        Person customer = new Person();
        String accnum, balance, name;

        BankAccount bank = new BankAccount();
        BankAccount accounts[] = new BankAccount[10];

        for(int i=0;i<accounts.length;i++)
        {
            acc = new BankAccount();
            accnum = JOptionPane.showInputDialog("Enter account number");
            acc.setAccnum(accnum);

            if(accnum.equals(""))
            {
                break;
            }


            acc.setBalance(Double.parseDouble(JOptionPane.showInputDialog("Enter Balance")));
            customer.setName(JOptionPane.showInputDialog("Enter account holder name"));
            accounts[i] = acc;



        }


        JOptionPane.showMessageDialog(null,bank.toString());

    }
}
