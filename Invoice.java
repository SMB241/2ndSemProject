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

    public String getInvoice(){
        return invoicenum;
    }

    public String getDate(){
        return purchasedate;
    }

    public String getName(){
        return customername;
    }

    public double getamount(){
        return invoiceamount;
    }

    public void setInvoice(String i){
        invoicenum = i;
    }

    public void setDate(String d){
        purchasedate = d;
    }

    public void setName(String n){
        customername = n;
    }

    public void setAmount(double a){
        invoiceamount = a;
    }
    
    public void DisplayInfo(){ 
        System.out.println("Invoice Number: " + invoicenum);
        System.out.println("Purchase Date: " + purchasedate);
        System.out.println("Customer Name: " + customername);
        System.out.println("Amount: " + invoiceamount);
    }
}