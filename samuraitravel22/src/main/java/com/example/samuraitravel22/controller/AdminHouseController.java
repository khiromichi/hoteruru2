package com.example.samuraitravel22.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.samuraitravel22.entity.House;
import com.example.samuraitravel22.repository.HouseRepository;

@Controller
@RequestMapping("/admin/houses")
public class AdminHouseController {
	private final HouseRepository houseRepository;
	
	public AdminHouseController(HouseRepository houseRepository) {
		this.houseRepository = houseRepository;
	}
	
	@GetMapping
	public String index(Model model, Pageable pageable) {
		List<House> houses = houseRepository.findAll();
		Page<House> housePage = houseRepository.findAll(pageable);
		
		model.addAttribute("houses", houses);
		model.addAttribute("housePage", housePage);
		
		return "admin/houses/index";
	}
}
