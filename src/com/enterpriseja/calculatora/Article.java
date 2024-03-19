package com.enterpriseja.calculatora;

public class Article{
    private float price;

    public Article(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) throws Exception {
        if(price < 0){
            throw new Exception("The price can not be below zero");
        }
        this.price = price;
    }
}
