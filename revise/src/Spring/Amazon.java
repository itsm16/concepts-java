package Spring;

public class Amazon {
    private DeliveryService service;

    public Amazon(DeliveryService service){
        this.service = service;
    }

    public void setService(DeliveryService service) { // DeliverService service = new FedEx();
        this.service = service;
    }

    Boolean deliverTheProduct(double amount){
        // tight coupling
        //Fedex fed = new Fedex();

//        shorter better syntax
//        return new Fedex().deliverProduct(233.4);

//        easier syntax
//        Fedex fed = new Fedex(); // tight coupling b/w amazon fedex
//        return fed.deliverProduct(amount);


//        now this can be used with setService
//        Fedex fed = new Fedex();
//        ama.setService(fed);

//        ama.setService(new Fedex());
//        Boolean result = ama.deliverTheProduct(233.3);

      /*
      not tightly coupled inside amazon, since usage is via service
      no direct usage / class instantiated inside amazon

      no inheritance
      no composition (class instantiation)
      */

      return service.deliverProduct(amount);
    };



}
