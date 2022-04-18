import java.sql.Date;

public class shoppingCartDTO {
    private Date datePurchase = new Date();
    private ClientDTO client;
    private int QuantityOfItems;

    public Date getDatePurchase(){
        return datePurchase;
    }
}
