package test.com.app.core;

import com.app.core.Bill;
import com.app.core.Product;
import com.app.core.ProductBasket;
import org.junit.jupiter.api.Test;


class BillTest {
  Product product=new Product("Burger",100,0,10);
  ProductBasket basket=new ProductBasket(product);
  Product p1= new Product("Table",50,1,15);
  Product p2 = new Product("Mobile",2500,2,5);
  Product p3=new Product("Wada Paav",10,0,25);
  Bill bill = new Bill(basket);



  @Test
  void displayProduct() {
    basket.addToCart(p1);
    basket.addToCart(p2);
    basket.addToCart(p3);
    bill.displayProduct();
  }

}