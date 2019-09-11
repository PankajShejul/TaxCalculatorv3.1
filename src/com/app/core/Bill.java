package com.app.core;

import java.util.List;

public class Bill {
  private ProductBasket basket;

  public Bill(ProductBasket basket) {
    this.basket = basket;

  }

  public void displayProduct() {
    double totalPrice = 0,netPayable=0;
    List<Product> list = basket.getCart();
    for (int j = 0; j < Product.Category.values().length; j++) {
      Product.Category TEMP= Product.Category.values()[j];
      System.out.println(TEMP+" :-");
      System.out.println("Name \t Price \t Quantity\t Total Amount");
      for (int i = 0; i < list.size(); i++) {
        if(list.get(i).getCategory()== TEMP) {
          System.out.print(list.get(i));
          System.out.print("\t" + list.get(i).getPrice() * list.get(i).getQuantity());
          System.out.println();
          totalPrice += list.get(i).getPrice() * list.get(i).getQuantity();
        }
      }

      double gst=((TEMP.getTaxRate()*totalPrice)/100);
      System.out.println("Amount:" + totalPrice);
      System.out.println("GST Amount: "+gst);
      totalPrice=totalPrice+gst;
      System.out.println("Amount After Tax:"+totalPrice);
      System.out.println("-------------------------------------------------------------");
      netPayable+=totalPrice;
      totalPrice=0;
    }
    System.out.println("Total Amount Payable : "+netPayable);

  }


}
