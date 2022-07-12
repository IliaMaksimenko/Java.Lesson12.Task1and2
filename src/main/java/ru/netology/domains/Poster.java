package ru.netology.domains;

public class Poster {

    private String nameFilm;
    private String genre;
    private String release;
    private int idFilm;

    public Poster(int idFilm, String nameFilm, String genre, String release) {

        this.idFilm = idFilm;
        this.nameFilm = nameFilm;
        this.genre = genre;
        this.release = release;

    }


}
