package com.codegym;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("nevermore6264@gmail.com", "7891532"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Trần Trung Hiếu", "168570382", "786", "12/15"));
    }
}
