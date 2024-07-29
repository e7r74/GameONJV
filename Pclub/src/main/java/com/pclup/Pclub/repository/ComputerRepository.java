package com.pclup.Pclub.repository;

import com.pclup.Pclub.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
//    List<Computer> findByRoom(String room);
//    Optional<Computer> findByNumber(String number);
//    List<Computer> findByAvailable(boolean available);
//    Optional<Computer> findByRoomAndNumber(String room, String number);
List<Computer> findByRoomAndNumber(String room, String number);
}

