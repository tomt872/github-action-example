package com.sprint.unittesting.unittesting.controller;

import com.sprint.unittesting.unittesting.service.ItemBusinessService;
import com.sprint.unittesting.unittesting.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemBusinessService businessService;

    @GetMapping("/")
    public String hello(){
        return "Hello World! 2" ;
    }

    @GetMapping("/dummy-item")
    public Item dummyItem(){
        return new Item(1,"New Ball", 10, 100);
    }

    @GetMapping("/item-from-business-service")
    public Item itemFromBusinessService(){
        Item item = businessService.retrieveHardcodedItem();
        return item;
    }

    @GetMapping("/all-items-from-database")
    public List<Item> retrieveAllItems(){
        return businessService.retrieveAllItems();
    }
}
