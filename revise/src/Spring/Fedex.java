package Spring;

public class Fedex implements DeliveryService{
    @Override
    public Boolean deliverProduct(double amt) {
        System.out.println("product delivered through Fedex, amt: "+ amt);
        return true;
    }
}
