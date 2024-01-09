package com.example.service;

import java.util.List;

import com.example.entity.Hotel;



public interface HotelService {

	Hotel createHotel(Hotel hotel);

	List<Hotel> getAllHotelList();

	Hotel getHotelById(String hotelid);





}
