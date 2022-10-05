package com.example.demo.Repositorio;

import com.example.demo.Interface.RoomInterface;
import com.example.demo.Modelo.Room;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class RoomRepository {
        
    @Autowired
    private RoomInterface extensionesCrud;
    
    public List <Room> getAll(){
        return (List<Room>) extensionesCrud.findAll();
    }
    
    public Optional <Room> getRoom(int id){
        return extensionesCrud.findById(id);
    }
    
    public Room save (Room room){
        return extensionesCrud.save(room);
    }
}
