package Lambda;
@FunctionalInterface
interface ImplOne{
    int add(int a, int b);
}
class First implements ImplOne{
    public int add(int a, int b){
        return a + b;
    }
}
public class LambdaTest {
    public static void main(String[] args) {
//        First objFirst = new First(){
//            // method overriden
//            @Override
//            public int add(int a, int b) {
//                int sum = a + b;
//                System.out.println("ran: "+ sum);
//                return a+b;
//            }
//        };
        // method called
//        objFirst.add(2, 4);
//        can also remove data type def, brace , return
//        ImplOne objFirst = (int a, int b) -> {
//            return a + b;
//        };
        ImplOne objSecond = (a,b) -> a + b;
        System.out.println("ran: " + objSecond.add(2, 4));
    }
}