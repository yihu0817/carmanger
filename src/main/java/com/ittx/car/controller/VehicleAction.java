package com.ittx.car.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ittx.car.model.Function;
import com.ittx.car.model.Vehicle;
import com.ittx.car.service.SecureService;

@Controller
@RequestMapping("/vehicle")
public class VehicleAction {
	@Autowired
	private SecureService secureService;

	//vehicle/listvehicle.do
	@RequestMapping(value = "listvehicle")
	public String listFunction(Map<String, List<Vehicle>> map,Model model) {
		List<Vehicle> lists = secureService.getAllVehicleList();
		map.put("vehicleList", lists);
		return "vehicle/vehicle_list";
	}
	

	

}
