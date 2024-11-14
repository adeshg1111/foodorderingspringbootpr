package com.example.demo.Dto;

import com.example.demo.model.Location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDto {

    private String restaurantName;
    private Location location;
    private String description;
    private String rating;
}
