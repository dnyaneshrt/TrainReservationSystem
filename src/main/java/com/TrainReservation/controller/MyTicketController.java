package com.TrainReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.TrainReservation.service.MyTicketService;

@Controller
public class MyTicketController {

	@Autowired
   private MyTicketService service;

    @RequestMapping("/deleteMyticket/{id}")
 public String deleteMyticket(@PathVariable("id")int id){
	service.deleteById(id);
	return "redirect:/myticket";
}
}
