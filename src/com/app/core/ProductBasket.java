package com.app.core;

import java.util.ArrayList;
import java.util.List;

public class ProductBasket {
  private List<Product> productList;
  public ProductBasket(Product product){
    productList=new ArrayList<>();
    productList.add(product);
  }
  public void addToCart(Product p){
   productList.add(p);
  }

  public List<Product> getCart(){
    return productList;
  }

}
