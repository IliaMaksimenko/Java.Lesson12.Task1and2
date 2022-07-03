package ru.netology.domains;

public class Manager {

    private String nameFilm;
    private String genre;
    private String release;
    private int idFilm;
    public int amountOfFilms = 10;

    public Manager(int idFilm, String nameFilm, String genre, String release) {

        this.idFilm = idFilm;
        this.nameFilm = nameFilm;
        this.genre = genre;
        this.release = release;

    }

    public Manager(int amount) {
        this.amountOfFilms = amount;
    }

    public Manager() {

    }

    public Manager[] poster = new Manager[0];

    public void save(Manager film) {
        Manager[] currentPoster = new Manager[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            currentPoster[i] = poster[i];
        }
        currentPoster[currentPoster.length - 1] = film;
        poster = currentPoster;
    }


    public Manager[] getPoster() {

        return poster;
    }


    public Manager[] getReversePoster() {
        Manager[] all = getPoster();
        Manager[] reversed = new Manager[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public Manager[] getShortReversePoster() {
        Manager[] shortPoster = new Manager[amountOfFilms];
        System.arraycopy(getReversePoster(), 0, shortPoster, 0, shortPoster.length);

        return shortPoster;
    }
}

