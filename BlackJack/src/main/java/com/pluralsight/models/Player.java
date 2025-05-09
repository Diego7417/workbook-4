package com.pluralsight.models;




public class Player {
    private String name;
  private static Hand hand;


    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public static Hand getHand() {
        return hand;
    }
}
