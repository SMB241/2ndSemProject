package Quiz;

import java.util.*;
public class AccountsReceivable extends Invoice {
    public AccountsReceivable(String invoicenum, String purchasedate, String customername, double invoiceamount) {
            super(invoicenum, purchasedate, customername, invoiceamount);
    
        }
    
        Scanner s = new Scanner(System.in);
    
    public void main(String[] args){


        System.out.print("Enter Invoice Number: ");
        String invoicenum = s.nextLine();

        System.out.print("Enter Purchase Date (YYY-MM-DD): ");
        String purchasedate = s.nextLine();

        System.out.print("Enter Customer Name: ");
        String customername = s.nextLine();
    
        System.out.print("Enter Invoice Amount: ");
        double invoiceamount = s.nextDouble();

        System.out.println(" ");

        System.out.println("Invoice Created Succesfully");

        Payment customer1 = new Payment(invoicenum, purchasedate, customername, invoiceamount);

        customer1.DisplayInfo();
    }
}