package com.TrainReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TrainReservation.entity.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train,Integer>{
	
}

