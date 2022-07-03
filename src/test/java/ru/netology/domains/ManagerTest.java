package ru.netology.domains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    Manager film1 = new Manager(10451, "Бладшот", "боевик", "2020");
    Manager film2 = new Manager(24525, "Вперед!", "мультфильм", "2020");
    Manager film3 = new Manager(25147, "Отель Белград", "комедия", "2020");
    Manager film4 = new Manager(12564, "Джентельмены", "боевик", "2019");
    Manager film5 = new Manager(95621, "Зверопой 2", "мультфильм", "2022");
    Manager film6 = new Manager(32657, "Челове-неведимка", "Ужасы", "2021");
    Manager film7 = new Manager(13542, "Тролли.Мировой тур", "мультфильм", "2020");
    Manager film8 = new Manager(95641, "Номер один", "боевик", "2020");
    Manager film9 = new Manager(13254, "Нулевой пациент", "драма", "2020");
    Manager film10 = new Manager(56218, "Бесконечность", "боевик", "2021");
    Manager film11 = new Manager(86542, "Не смотрите на верх!", "комедия", "2021");
    Manager film12 = new Manager(13584, "Гнев", "боевик", "2021");
    Manager film13 = new Manager(85461, "Круэлла", "драма", "2021");
    Manager film14 = new Manager(62545, "Энканто", "мультфильм", "2021");
    Manager film15 = new Manager(32354, "Аллея кошмаров", "триллер", "2021");


    @Test
    public void testDefaultPoster() {
        Manager poster = new Manager();
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        poster.save(film6);
        poster.save(film7);
        poster.save(film8);
        poster.save(film9);
        poster.save(film10);
        poster.save(film11);
        poster.save(film12);
        poster.save(film13);
        poster.save(film14);
        poster.save(film15);

        Manager[] expected = {film15, film14, film13, film12, film11, film10, film9, film8, film7, film6};
        Manager[] actual = poster.getShortReversePoster();

        Assertions.assertArrayEquals(actual, expected);

    }

    Manager poster = new Manager(5);

    @BeforeEach
    public void setupPoster() {
        poster.save(film1);
        poster.save(film2);
        poster.save(film3);
        poster.save(film4);
        poster.save(film5);
        poster.save(film6);
        poster.save(film7);
        poster.save(film8);
        poster.save(film9);
        poster.save(film10);
        poster.save(film11);
        poster.save(film12);
        poster.save(film13);
        poster.save(film14);
        poster.save(film15);
    }


    @Test
    public void testPoster() {

        Manager[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12, film13, film14, film15};
        Manager[] actual = poster.getPoster();

        Assertions.assertArrayEquals(actual, expected);
    }


    @Test
    public void testReversePoster() {

        Manager[] expected = {film15, film14, film13, film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        Manager[] actual = poster.getReversePoster();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void testShortReversePoster() {

        Manager[] expected = {film15, film14, film13, film12, film11};
        Manager[] actual = poster.getShortReversePoster();

        Assertions.assertArrayEquals(actual, expected);
    }
}
