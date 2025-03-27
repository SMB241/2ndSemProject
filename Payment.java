package Quiz;

import java.util.Scanner;

public class Payment extends Invoice{
   
double amountpaid;
String paymentdate;
String option;
int paymentMethod;
    public Payment(String invoicenum, String purchasedate, String customername, double invoiceamount, double amountpaid, String paymentdate, int paymentMethod,String option) {
            super(invoicenum, purchasedate, customername, invoiceamount);
            this.amountpaid = amountpaid;
            this.paymentdate =  paymentdate;
            this.paymentMethod = paymentMethod;
            this.option = option;
        }
    
        Scanner s = new Scanner(System.in);
        Scanner L = new Scanner(System.in);

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
        paymentdate = L.nextLine();

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
                System.out.println("Payment Status: Fully Paid" );
            }else{
                System.out.println("Remaining Balance: " + remainingBalance);
            }
         }else if(paymentMethod == 2){
            remainingBalance =  invoiceamount - amountpaid;
            System.out.println("Is the check on-date or post-date(O for On-date, P for Post-date): ");
            String type = L.nextLine();
            System.out.println("Enter Check Number: ");
            int num = s.nextInt();
            System.out.println("");
            System.out.println("Payment Recorded Successfully!");
            System.out.println("");
            super.DisplayInfo();
            System.out.println("Amount Paid: " + amountpaid);
            System.out.println("Payment Date: " + paymentdate);
            System.out.println("Payment Method: Check");
            System.out.println("Check Type: On-date");
            System.out.println("Check Number: " + num);
            
            if(remainingBalance == 0){
                System.out.println("Payment Status: Fully Paid" );
            }else{
                System.out.println("Remaining Balance: " + remainingBalance);
            }

             }
        
         }
     public void loop(){
        System.out.println("Do you want to apply another payment to this invoice?: (Y/N)");
        option = L.nextLine();
        do AmountPaid(); while (option == "Y");
            
     }
 }
