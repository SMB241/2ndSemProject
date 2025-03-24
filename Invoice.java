package Quiz;

public class Invoice{
public String invoicenum;
public String purchasedate;
public String customername;
public double invoiceamount;

 Invoice(String invoicenum, String purchasedate, String customername, double invoiceamount){
    this.invoicenum = invoicenum;
    this.purchasedate = purchasedate;
    this.customername = customername;
    this.invoiceamount = invoiceamount; 
    }


    public void DisplayInfo(){ 
        System.out.print("Invoice Number:" + invoicenum);
        System.out.print("Purchase Date; " + purchasedate);
        System.out.print("Customer Name" + customername);
        System.out.print("Invoice Amount: " + invoiceamount);
    }
}