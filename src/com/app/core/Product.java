package com.app.core;

public class Product {
  private String name;
  private int quantity;
  private int price;

  enum Category {
    FOOD, FURNITURE, ELECTRONICS;
    public int getTaxRate() {
      if(this==FOOD)
      {
        return 0;
      }
      else if(this==FURNITURE)
      {
        return 5;
      }else{
        return 10;
      }
    }
  }

  private Category category;

  public Product(String name, int price, int category, int quantity) {
    this.name = name;
    this.price = price;
    this.category = Product.Category.values()[category];
    this.quantity = quantity;
  }

  public Category getCategory() {
    return category;
  }

  public int getQuantity() {
    return quantity;
  }

  public int getPrice() {
    return price;
  }
  @Override
  public String toString() {
    return name + "\t" + price + "\t" + quantity;
  }


}
