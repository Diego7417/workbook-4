package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @Test
    void checkIn(){
        //arrange
        Room room = new Room(2, 158, true, true);
        //act
        room.checkIn();
        //assert
        assertFalse(room.isAvailable);
    }
    @Test
    void checkOut(){
        //arrange
        Room room = new Room(2, 158, false, true);
        //act
        room.checkOut();
        //assert
        assertFalse(room.isAvailable);
    }
    @Test
    void cleanRoom(){
        //arrange
        Room room = new Room(2, 158,false, true);
        //act
        room.cleanRoom();
        //assert
        assertFalse(room.cleanRoom());
    }
}