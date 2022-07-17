package ru.netology.domains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    Poster film1 = new Poster(10451, "Бладшот", "боевик", "2020");
    Poster film2 = new Poster(24525, "Вперед!", "мультфильм", "2020");
    Poster film3 = new Poster(25147, "Отель Белград", "комедия", "2020");
    Poster film4 = new Poster(12564, "Джентельмены", "боевик", "2019");
    Poster film5 = new Poster(95621, "Зверопой 2", "мультфильм", "2022");
    Poster film6 = new Poster(32657, "Челове-неведимка", "Ужасы", "2021");
    Poster film7 = new Poster(13542, "Тролли.Мировой тур", "мультфильм", "2020");
    Poster film8 = new Poster(95641, "Номер один", "боевик", "2020");
    Poster film9 = new Poster(13254, "Нулевой пациент", "драма", "2020");
    Poster film10 = new Poster(56218, "Бесконечность", "боевик", "2021");
    Poster film11 = new Poster(86542, "Не смотрите на верх!", "комедия", "2021");
    Poster film12 = new Poster(13584, "Гнев", "боевик", "2021");
    Poster film13 = new Poster(85461, "Круэлла", "драма", "2021");
    Poster film14 = new Poster(62545, "Энканто", "мультфильм", "2021");
    Poster film15 = new Poster(32354, "Аллея кошмаров", "триллер", "2021");


    @Test
    public void testFindAll() {

        Manager poster = new Manager();

        poster.saveFilm(film1);
        poster.saveFilm(film2);
        poster.saveFilm(film3);
        poster.saveFilm(film4);
        poster.saveFilm(film5);
        poster.saveFilm(film6);
        poster.saveFilm(film7);
        poster.saveFilm(film8);
        poster.saveFilm(film9);
        poster.saveFilm(film10);
        poster.saveFilm(film11);
        poster.saveFilm(film12);
        poster.saveFilm(film13);
        poster.saveFilm(film14);
        poster.saveFilm(film15);

        Poster[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12, film13, film14, film15};
        Poster[] actual = poster.getFindAll();

        Assertions.assertArrayEquals(actual, expected);
    }


    @Test
    public void testDefaultFindLast() {

        Manager poster = new Manager();

        poster.saveFilm(film1);
        poster.saveFilm(film2);
        poster.saveFilm(film3);
        poster.saveFilm(film4);
        poster.saveFilm(film5);
        poster.saveFilm(film6);
        poster.saveFilm(film7);
        poster.saveFilm(film8);
        poster.saveFilm(film9);
        poster.saveFilm(film10);
        poster.saveFilm(film11);
        poster.saveFilm(film12);
        poster.saveFilm(film13);
        poster.saveFilm(film14);
        poster.saveFilm(film15);

        Poster[] expected = {film15, film14, film13, film12, film11, film10, film9, film8, film7, film6};
        Poster[] actual = poster.getFindLast();

        Assertions.assertArrayEquals(actual, expected);

    }


    @Test
    public void testAllFindLast() {

        Manager poster = new Manager(15);

        poster.saveFilm(film1);
        poster.saveFilm(film2);
        poster.saveFilm(film3);
        poster.saveFilm(film4);
        poster.saveFilm(film5);
        poster.saveFilm(film6);
        poster.saveFilm(film7);
        poster.saveFilm(film8);
        poster.saveFilm(film9);
        poster.saveFilm(film10);
        poster.saveFilm(film11);
        poster.saveFilm(film12);
        poster.saveFilm(film13);
        poster.saveFilm(film14);
        poster.saveFilm(film15);

        Poster[] expected = {film15, film14, film13, film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        Poster[] actual = poster.getFindLast();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void testAdjustedFindLast() {

        Manager poster = new Manager(5);

        poster.saveFilm(film1);
        poster.saveFilm(film2);
        poster.saveFilm(film3);
        poster.saveFilm(film4);
        poster.saveFilm(film5);
        poster.saveFilm(film6);
        poster.saveFilm(film7);
        poster.saveFilm(film8);
        poster.saveFilm(film9);
        poster.saveFilm(film10);
        poster.saveFilm(film11);
        poster.saveFilm(film12);
        poster.saveFilm(film13);
        poster.saveFilm(film14);
        poster.saveFilm(film15);

        Poster[] expected = {film15, film14, film13, film12, film11};
        Poster[] actual = poster.getFindLast();

        Assertions.assertArrayEquals(actual, expected);
    }


    @Test
    public void testFindLastLessThanTheLimit() {

        Manager poster = new Manager(10);

        poster.saveFilm(film1);
        poster.saveFilm(film2);
        poster.saveFilm(film3);
        poster.saveFilm(film4);
        poster.saveFilm(film5);
        poster.saveFilm(film6);
        poster.saveFilm(film7);
        poster.saveFilm(film8);


        Poster[] expected = {film8, film7, film6, film5, film4, film3, film2, film1};
        Poster[] actual = poster.getFindLast();

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void testFindLastEmptyPoster() {

        Manager poster = new Manager(10);


        Poster[] expected = {};
        Poster[] actual = poster.getFindLast();

        Assertions.assertArrayEquals(actual, expected);

    }
}
