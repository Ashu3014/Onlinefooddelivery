package com.foodapp.model;

import java.util.HashMap;
import java.util.Map;

public enum Category {
    Coffee(0),
    Pizza(1),
    Burger(2),
    FrenchFries(3),
    Sandwitch(4),
   Momos(5);

    private int value;
    private static Map map = new HashMap<>();

    private Category(int value) {
        this.value = value;
    }

    static {
        for (Category category : Category.values()) {
            map.put(category.value, category);
        }
    }

    public static Category valueOf(int category) {
        return (Category) map.get(category);
    }

    public int getValue() {
        return value;
    }
}
