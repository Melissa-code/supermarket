package product;

import java.util.ArrayList;


public class ShoppingCart {
    public static ArrayList<Product> listCart;

    //constructeur
    public ShoppingCart() {
        this.listCart = new ArrayList<>();
        //listCart.add(new Product(1,"chocolate", 2.10, 2));
    }

    public ArrayList<Product> getCart() {
        return listCart;
    }

    public static ArrayList<Product> getListCart() {
        return listCart;
    }

    public static void setListCart(ArrayList<Product> listCart) {
        ShoppingCart.listCart = listCart;
    }

    //calcul total panier client
    public double getCartTotalAmount() {
        double totalAmount = 0;
        for (int i = 0; i < listCart.size(); i++) {
            totalAmount = totalAmount + (listCart.get(i).getQuantity() * listCart.get(i).getPrice());
        }
        return totalAmount;
    }

    //display cart
    public void displayCart() {
        int count = 0;
        System.out.println(" ________________________");
        System.out.println("|   Your Shopping Cart   |");
        System.out.println(" ------------------------");
        for(Product elements : listCart){
            if(listCart == null ) {
                System.out.println("Your cart is empty\n");
            } else {
                System.out.println("product : " + elements.getName() + " price: " + elements.getPrice() + "quantity: " + elements.getQuantity());
                count++;
            }
        }
        System.out.println("| Total Amount :" + getCartTotalAmount()+" | " + "Total items : " + count + "\n");
    }

    //create a new shopping cart content
    public static void addToCart(int id, String name, double price, int quantity){
        Product addProduct = new Product(id, name, price, quantity);
        listCart.add(addProduct);
    }

    //remove shopping cart
    public void clearShippingCart() {
        listCart.removeAll(listCart);
    }
}

