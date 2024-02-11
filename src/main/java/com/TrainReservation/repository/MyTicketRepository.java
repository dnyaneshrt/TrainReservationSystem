package com.TrainReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TrainReservation.entity.MyTickets;

@Repository
public interface MyTicketRepository extends JpaRepository<MyTickets,Integer>{

	
}