import java.util.*;
public class AccountsReceivable {
    
    String invoicenum;
    String purchasedate;
    String customername;
    double invoiceamount;

    Scanner s = new Scanner(System.in);

    public void creatInvoice(){
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

    public void displayInvoice(){
        System.out.println("Invoice Number: " + invoicenum);
        System.out.println("Purchase Date: " + purchasedate);
        System.out.println("Customer Name: " + customername);
        System.out.println("Amount: " + invoiceamount);
    }



}
