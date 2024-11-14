package com.example.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LocationDto {

    private Double latitude;
    private Double longitude;
    private String city;
    private String country;

}
