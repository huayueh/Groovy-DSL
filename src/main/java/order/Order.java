package order;

/**
 * User: Harvey
 * Date: 2014/8/22
 * Time: 下午 03:38
 */
public class Order {
    public int entry(Direction dir, double price) {
        System.out.println("entry " + dir + " at " + price);
        return 123456;
    }

    public boolean close(int id) {
        System.out.println("order " + id + " close ");
        return true;
    }
}
