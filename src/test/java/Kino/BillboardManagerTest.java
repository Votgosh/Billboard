package Kino;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillboardManagerTest {

    @Test
    void addMovie() {
        BillboardManager manager = new BillboardManager();
        String[] nameMovieTestData = new String[] {"Bladshot", "Vpered", "HotelBelgrad", "Gentlemen"};
        manager.setNameMovie(nameMovieTestData);
        String[] expected = new String[]{"Bladshot", "Vpered", "HotelBelgrad", "Gentlemen", "NomerOdin"};
        String addMovie = "NomerOdin";
        manager.add(addMovie);
        String[] actual = manager.getNameMovie();
        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {
        BillboardManager manager = new BillboardManager();
        String[] nameMovieTestData = new String[] {"Bladshot", "Vpered", "HotelBelgrad", "Gentlemen", "NomerOdin"};
        manager.setNameMovie(nameMovieTestData);
        String[] expected = new String[]{"NomerOdin", "Gentlemen", "HotelBelgrad", "Vpered", "Bladshot"};
        manager.findLast();
        String[] actual = manager.getNameMovie();
        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastNewLimit() {
        BillboardManager manager = new BillboardManager(4);
        String[] nameMovieTestData = new String[] {"Bladshot", "Vpered", "HotelBelgrad", "Gentlemen", "NomerOdin"};
        manager.setNameMovie(nameMovieTestData);
        String[] expected = new String[]{"NomerOdin", "Gentlemen", "HotelBelgrad", "Vpered"};
        manager.findLast();
        String[] actual = manager.getNameMovie();
        assertArrayEquals(expected, actual);
    }
}