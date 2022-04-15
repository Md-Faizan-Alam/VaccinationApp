package com.assignment.boot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.boot.model.Center;
import com.assignment.boot.service.CenterService;

@RestController
public class RestApiController {
	
	@Autowired
	CenterService centerService;
	
	@GetMapping("/")
	public ModelAndView homepage() {
		return new ModelAndView("home");
	}
	
	@GetMapping("/allCenters")
	public ModelAndView allCenters() {
		ModelAndView mav = new ModelAndView("allCenters");
		List<Center> centerList = centerService.getAll();
		mav.addObject("centerList",centerList);
		return mav;
	}
	
	@GetMapping("/findByDistrict")
	public ModelAndView findByDistrict() {
		return new ModelAndView("distSearch");
	}
	@PostMapping("/distList")
	public ModelAndView districtList(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("allCenters");
		String district = request.getParameter("district");
		List<Center> centerList = centerService.getByDistrict(district);
		mav.addObject("centerList",centerList);
		return mav;
	}
	
	@GetMapping("/findByPincode")
	public ModelAndView findByPincode() {
		return new ModelAndView("pinSearch");
	}
	@PostMapping("/pinList")
	public ModelAndView pincodeList(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("allCenters");
		int pincode = Integer.parseInt(request.getParameter("pincode"));
		List<Center> centerList = centerService.getByPincode(pincode);
		mav.addObject("centerList",centerList);
		return mav;
	}
	
	@PostMapping("/baseurl/api/v1/setList")
	public void addCenters(@RequestBody List<Center> centerList) {
		centerService.addCenterList(centerList);
	}
	@PostMapping("/baseurl/api/v1/set")
	public void addCenter(@RequestBody Center center) {
		System.out.println("Entering addCenter method");
		centerService.addCenter(center);
	}
	
	@GetMapping("/baseurl/api/v1/all")
	public ResponseEntity<List<Center>> getAllCenters(){
		List<Center> centerList = centerService.getAll();
		return new ResponseEntity<List<Center>>(centerList,HttpStatus.OK);
	}
	
	@GetMapping("/baseurl/api/v1/{pincode}")
	public ResponseEntity<List<Center>> getCenterByPincode(@PathVariable("pincode") int pincode){
		List<Center> centerList = centerService.getByPincode(pincode);
		return new ResponseEntity<List<Center>>(centerList,HttpStatus.OK);
	}
	
	@GetMapping("/baseurl/api/v1")
	public ResponseEntity<List<Center>> getCenterByDistrict(@RequestParam(value = "district") String district){
		List<Center> centerList = centerService.getByDistrict(district);
		return new ResponseEntity<List<Center>>(centerList,HttpStatus.OK);
	}
}
