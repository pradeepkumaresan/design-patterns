package com.pradeep.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Item createItem(String type) {
        Item item = null;
        try{
            item = (Item) items.get(type).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }

    public Registry() {
        loadItems();
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");
        items.put("Book", book);
    }

}
