package Spring;

public class LaunchAmazon {

    public static void main(String[] args){
        // composition - object creation
        Amazon ama = new Amazon(new Fedex()); // constructor injection

//        same syntax differently below
//        Fedex fed = new Fedex();
//        ama.setService(fed);

//        same
        ama.setService(new BlueDart()); // setter injection
        // from constructor / setter injection - setter injection gets used 
        Boolean result = ama.deliverTheProduct(233.3);

        if(result)
            System.out.println("Delivered Successfully");
        else
            System.out.println("Some err");
    }
}
