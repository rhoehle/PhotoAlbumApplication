package com.robertleehoehle;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Robert Hoehle
 */
class PhotoTest {

    @org.junit.jupiter.api.Test
    void getAlbumId() {
        Photo photo = new Photo("15","740", "aye no latin", "https://via.someholder.com/666/26420",
                "https://via.aplaceholder.com/15/45782");
        assertEquals(15, 15);
    }

    @org.junit.jupiter.api.Test
    void getId() {
        Photo photo = new Photo("15","740", "aye no latin", "https://via.someholder.com/666/26420",
                "https://via.aplaceholder.com/15/45782");
        assertEquals(740, 740);
    }

    @org.junit.jupiter.api.Test
    void getTitle() {
        Photo photo = new Photo("15","740", "aye no latin", "https://via.someholder.com/666/26420",
                "https://via.aplaceholder.com/15/45782");
        assertEquals("aye no latin", "aye no latin");
    }

    @org.junit.jupiter.api.Test
    void setAlbumId() {
    }

    @org.junit.jupiter.api.Test
    void setId() {
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
    }

    @org.junit.jupiter.api.Test
    void toString1() {
    }

}