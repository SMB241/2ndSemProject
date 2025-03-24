package Quiz;

import java.util.Scanner;

public class Payment extends Invoice{
    

    public Payment(String invoicenum, String purchasedate, String customername, double invoiceamount) {
            super(invoicenum, purchasedate, customername, invoiceamount);
        }
    
        Scanner s = new Scanner(System.in);

    public void createInvoice(){
        System.out.print("Enter Invoice Number: ");
        String invoicenum =s.nextLine();

        System.out.print("Enter Purchase Date (YYY-MM-DD): ");
        String purchasedate =s.nextLine();

        System.out.print("Enter Customer Name: ");
        String customername =s.nextLine();
    
        System.out.print("Enter Invoice Amount: ");
        double invoiceamount =s.nextDouble();

        System.out.println("Invoice Created Succesfully");
    }


}
