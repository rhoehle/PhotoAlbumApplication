package com.robertleehoehle;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Robert Hoehle
 */
class PhotoTest {

    @org.junit.jupiter.api.Test
    void testGetAlbumId() {
        Photo photo = new Photo();
        photo.setAlbumId("23");
        assertEquals("23", photo.getAlbumId());
    }

    @org.junit.jupiter.api.Test
    void testGetId() {
        Photo photo = new Photo();
        photo.setId("769");
        assertEquals("769", photo.getId());
    }

    @org.junit.jupiter.api.Test
    void testGetTitle() {
        Photo photo = new Photo();
        photo.setTitle("Yo no latin to speak");
        assertEquals("Yo no latin to speak", photo.getTitle());
    }

    @org.junit.jupiter.api.Test
    void testSetAlbumId() {
    }

    @org.junit.jupiter.api.Test
    void testSetId() {
    }

    @org.junit.jupiter.api.Test
    void testSetTitle() {
    }

    @org.junit.jupiter.api.Test
    void testToString1() {
        Photo photo = new Photo("16", "766", "Test Title name",
                "https://via.placeholder.com/600/1958a9", "https://via.placeholder.com/150/1958a9");
        assertEquals("> photo-album 16  |  [766]  |  'Test Title name'", photo.toString());
    }

}