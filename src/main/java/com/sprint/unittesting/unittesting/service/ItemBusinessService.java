package com.sprint.unittesting.unittesting.service;

import com.sprint.unittesting.unittesting.entity.Item;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemBusinessService {
    public Item retrieveHardcodedItem() {
        return new Item(2,"Desk", 100, 200);
    }

    public List<Item> retrieveAllItems() {
        ArrayList<Item> ret = new ArrayList<>();
        ret.add(new Item(1,"Ball", 10, 100));
        ret.add(new Item(2,"Desk", 100, 200));
        ret.add(new Item(3,"Cloth", 30, 150));
        return ret;
    }
}
