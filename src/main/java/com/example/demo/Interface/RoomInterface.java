package com.example.demo.Interface;

import com.example.demo.Modelo.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomInterface extends CrudRepository <Room, Integer> {
    
}
