package com.pradeep.creational.builder;

public class TestLunchOrder {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce")/*.dressing("Mayo")*/.meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder);
    }
}
