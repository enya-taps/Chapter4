import java.util.ArrayList;

public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {

        for(int i = 0; i< stock.size(); i++){
            Product specific = stock.get(i);
            if(specific.getID() == id){
                specific.increaseQuantity(amount);
            }
        }

    }
    
    public Product findProduct(String name){
    
        for(int i = 0; i< stock.size(); i++){
            Product specific = stock.get(i);
            if(specific.equals(name)){
                return specific;
            }
        }
        return null;
        
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {

        for(int i = 0; i< stock.size(); i++){
            Product specific = stock.get(i);
            if(specific.getID() == id){
                return specific;
            }
        }
        return null;
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {

        for(int i = 0; i< stock.size(); i++){
            Product specific = stock.get(i);
            if(specific.getID() == id){
                return specific.getQuantity();
            }
        }

        return 0;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        for(Product pro : stock){
            System.out.println(pro.toString());
        }
    }
}
