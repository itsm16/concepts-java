package Spring;

public class BlueDart implements DeliveryService{
    @Override
    public Boolean deliverProduct(double amt) {
        System.out.println("product delivered through BlueDart, amt: "+ amt);
        return true;
    }
}
