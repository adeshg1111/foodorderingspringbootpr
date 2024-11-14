package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {

    @Override
    Optional<Restaurant> findById(Long id);
}
