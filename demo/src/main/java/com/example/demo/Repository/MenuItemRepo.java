package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.MenuItem;

public interface MenuItemRepo extends JpaRepository<MenuItem, Long> {

    List<MenuItem> findByRestaurantId(Long restaurant);
}
