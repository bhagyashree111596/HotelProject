package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Hotel;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.HotelRepository;
import com.example.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		return  hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotelList() {

		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotelById(String hotelid) {

		return hotelRepository.findById(hotelid).orElseThrow(()->new ResourceNotFoundException("hotel with give id not found on server"+hotelid));
	}


}
