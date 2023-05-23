package com.sprint.unittesting.unittesting.entity;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class Item {
    int id;
    String itemName;
    int stock;
    int maxStock;

    public Item(int id, String itemName, int stock, int maxStock){
        this.id = id;
        this.itemName = itemName;
        this.stock = stock;
        this.maxStock = maxStock;
    }
}
