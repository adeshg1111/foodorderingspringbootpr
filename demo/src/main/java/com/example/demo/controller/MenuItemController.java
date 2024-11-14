package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.MenuItemDto;
import com.example.demo.Entity.MenuItem;
import com.example.demo.service.MenuItemService;

@RestController
public class MenuItemController {

    @Autowired
    MenuItemService menuItemService;

    @PostMapping("addMenu")
    public MenuItem createMenuItem(@RequestBody MenuItemDto menuItemDto) {
        return menuItemService.createMenuItem(menuItemDto);
    }

    @GetMapping("listMenuItem/{id}")
    public List<MenuItem> getListOfMenuItems(@PathVariable long id) {
        return menuItemService.getMenuList(id);
    }

    @PutMapping("updateMenuItem/{id}")
    public MenuItem updaMenuItems(@RequestBody MenuItemDto menuItemDto, @PathVariable long id) {
        return menuItemService.updateMenuItem(menuItemDto, id);
    }

    @DeleteMapping("deletemenuitem/{id}")
    public String deleteMenuItemById(@PathVariable long id) {
        return menuItemService.deleteById(id);
    }
}
