package com.example.demo.Servicio;

import com.example.demo.Modelo.Room;
import com.example.demo.Repositorio.RoomRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    
    @Autowired
    private RoomRepository roomRepository;
    
    public List<Room> getAll(){
        return roomRepository.getAll();       
    }
    
    public Optional <Room> getRoom(int id){
        return roomRepository.getRoom(id);
    }
    
        public Room save (Room room){
        if (room.getId() == null){
            return roomRepository.save(room);
        }else{
            Optional<Room> room1 = roomRepository.getRoom(room.getId());
            if(room1.isEmpty()){
                return roomRepository.save(room);
            }else{
                return room;
            }
        }
    }
    
}
