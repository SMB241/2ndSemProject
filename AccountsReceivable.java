package Quiz;

import java.util.*;
public class AccountsReceivable {
    Scanner s = new Scanner(System.in);
    String paymentdate;
    int paymentMethod;
    double amountpaid;
    String invoicenum;
     String purchasedate;
     String customername;
    double invoiceamount;
    
    public void main(String[] args){

        Payment customer1 = new Payment(invoicenum, purchasedate, customername, invoiceamount, invoiceamount,  paymentdate, paymentMethod);

        customer1.createInvoice();
        customer1.AmountPaid();
    }

}