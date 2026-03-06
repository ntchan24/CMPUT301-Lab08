package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

public class CustomListTest {
    @Test
    public void testHasCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "Alberta");

        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "Alberta");
        list.addCity(edmonton);
        list.deleteCity(edmonton);

        assertFalse(list.hasCity(edmonton));

        assertThrows(NoSuchElementException.class, () -> {
            list.deleteCity(edmonton);
        });


    }
}
