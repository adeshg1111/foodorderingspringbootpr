package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.Dto.MenuItemDto;
import com.example.demo.Entity.MenuItem;

public interface MenuItemInterface {

    public MenuItem createMenuItem(MenuItemDto menuItemDto);

    public List<MenuItem> getMenuList(long id);

    public MenuItem updateMenuItem(MenuItemDto menuItemDto, long id);

    public String deleteById(long id);
}
