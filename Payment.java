package Quiz;

import java.util.Scanner;

public class Payment extends Invoice{
   
double amountpaid;
String paymentdate;
int paymentMethod;
    public Payment(String invoicenum, String purchasedate, String customername, double invoiceamount, double amountpaid, String paymentdate, int paymentMethod) {
            super(invoicenum, purchasedate, customername, invoiceamount);
            this.amountpaid = amountpaid;
            this.paymentdate =  paymentdate;
            this.paymentMethod = paymentMethod;
        }
    
        Scanner s = new Scanner(System.in);

    public void createInvoice(){
        System.out.println("Enter Invoice Number: ");
        invoicenum = s.nextLine();

        System.out.println("Enter Purchase Date (YYY-MM-DD): ");
        purchasedate =s.nextLine();

        System.out.println("Enter Customer Name: ");
        customername = s.nextLine();
    
        System.out.println("Enter Invoice Amount: ");
        invoiceamount = s.nextDouble();

        System.out.println(" ");
        System.out.println("Invoice Created Succesfully");
        System.out.println(" ");

    }
    public void AmountPaid(){
    double remainingBalance;
    
        System.out.println("Amount Paid: ");
        amountpaid = s.nextDouble();

        System.out.println("Payment Date(YYY-MM-DD): ");
        paymentdate = s.nextLine();

        System.out.println("Payment Method (1 for Cash, 2 for Check): ");
        paymentMethod = s.nextInt();

        if (paymentMethod == 1){
            remainingBalance =  invoiceamount - amountpaid;
        System.out.println("");
        System.out.println("Payment Recorded Successfully!");
        System.out.println("");
        super.DisplayInfo();
        System.out.println("Amount Paid: " + amountpaid);
        System.out.println("Payment Date: " + paymentdate);
        System.out.println("Payment Method: Cash");
            if(remainingBalance == 0){
                System.out.println("Status: Fully Paid" );
            }else{
                System.out.println("Remaining Balance: " + remainingBalance);
            }
         }
    }
}
