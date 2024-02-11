package com.TrainReservation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.TrainReservation.entity.MyTickets;
import com.TrainReservation.entity.Train;
import com.TrainReservation.service.TrainService;
import com.TrainReservation.service.MyTicketService;

@Controller
public class TrainReservationController {
     
	@Autowired
	private TrainService service;
	
     @GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/railway_register")
	public String railwayregister() {
		
		return "railwayregister";
	}
	@GetMapping("/railway_information")
	public ModelAndView getAllTrain(){
		List<Train> list=service.getAllTrains();
		ModelAndView m=new ModelAndView();
		m.setViewName("railwaylist");
		m.addObject("railway",list);
		return new ModelAndView("railwaylist","train",list);
	}

	@PostMapping("/save")
		public String addTrain(@ModelAttribute Train t) {
		service.save(t);
		return "redirect:/railway_information";
	}
	
	@GetMapping("/mytickets")
	public String getBookedTickets(){
		return "mytickets";
	}
	@RequestMapping("/mytickets/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Train t=service.getTrainById(id);
		MyTickets mb=new MyTickets(t.getTrain_id(),t.getTrain_name(),t.getArrival(),t.getDeparture(),t.getTime());
		MyTicketService myTicketService = new MyTicketService();
		myTicketService.saveMyTicket(mb);
		return "redirect:/mytickets";
	}

}
