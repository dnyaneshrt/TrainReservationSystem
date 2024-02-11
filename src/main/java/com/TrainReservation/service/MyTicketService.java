package com.TrainReservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TrainReservation.entity.MyTickets;
import com.TrainReservation.repository.MyTicketRepository;

@Service
public class MyTicketService {
@Autowired
private MyTicketRepository myticket;

public  void saveMyTicket(MyTickets ticket) {
	myticket.save(ticket);
}
public List<MyTickets>getAllMyTickets(){
	return myticket.findAll();
	
}
public void deleteById(int id){
	myticket.deleteById(id);
	
}
}
