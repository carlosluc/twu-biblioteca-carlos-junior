package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class ItemManagement {

    List<Item> allItens;

    public <T extends Item> List<T> getAllAvailableItens() {
        List<T> allAvailableItens = new ArrayList<T>();

        for (Item item : this.allItens) {
            if (item.isAvailable()){
                allAvailableItens.add((T) item);
            }
        }
        return allAvailableItens;
    }

    public Item findItem(String name) {

        for (Item item : allItens) {
            if (item.getName().equalsIgnoreCase(name))
                return item;
        }

        return null;
    }

    public String checkOutItem(String itemToCheckOut) {

        Item item = findItem(itemToCheckOut);

        if (item != null && item.isAvailable()) {
            item.setAvailable(false);
            return "Thank you! Enjoy it";
        } else {
            return "That item is not available";
        }
    }

    public String returnItem(String itemToReturn) {

        Item item = findItem(itemToReturn);

        if (item != null) {
            item.setAvailable(true);
            return "Thank you for returning the item";
        } else {
            return "That is not a valid item to return";
        }
    }
}
