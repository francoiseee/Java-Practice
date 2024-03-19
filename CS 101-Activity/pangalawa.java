import java.text.*;
public class pangalawa{
public double total;
public double nettotal;
public String num;
public String name;
public String address;
public String description;
public double price;
public double quantity;
static DecimalFormat df = new DecimalFormat("#,##0.00");

//variables that will input by the user later on
    public void setnum(String cn ){
        num = cn;
    }

    public void setname(String nm ){
        name = nm;
    }

    public void setaddress(String adris ){
        address = adris;
    }

    public void setdescription(String des ){
        description = des;
    }

    public void setprice(double prc ){
        price = prc;
    }

    public void setquantity(double qty ){
        quantity = qty;
    }

    public void menu(){
        System.out.println("Mode of Payment:");
        System.out.println("[1]\tCash - less 5%");
        System.out.println("[2]\ttwo installment - 5% interest");
        System.out.println("[3]\tthree installment - 10% interest");
    }

//Enter the mode of payment choice
    public void choice(char ch){
        char choice = ch;
        switch (choice) {
            case '1': computeone(price, quantity); break;
            case '2': computetwo(price, quantity);break;
            case '3': computethree(price, quantity);break;
        }
    }

    public void computeone(double a, double b){
        total = a*b;
        nettotal = total*.95;
    }

    public void computetwo(double a, double b){
        total = a*b;
        nettotal = total*1.05;
    }

    public void computethree(double a, double b){
        total = a*b;
        nettotal = total*1.1;  
    }

    public void display(){
        System.out.println("Total Price: \tPhp " + df.format(total));
        System.out.println("Total Price: \tPhp " + df.format(nettotal) );
    }
}
