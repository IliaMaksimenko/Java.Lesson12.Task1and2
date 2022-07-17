package ru.netology.domains;

public class Manager {

    private int amountOfFilms;

    private Poster[] films = new Poster[0];

    public Manager(int amount) {

        this.amountOfFilms = amount;

    }

    public Manager() {

        this.amountOfFilms = 10;

    }


    public void saveFilm(Poster film) {
        Poster[] currentPoster = new Poster[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            currentPoster[i] = films[i];
        }
        currentPoster[currentPoster.length - 1] = film;
        films = currentPoster;
    }


    public Poster[] getFindAll() {

        return films;

    }


    public Poster[] getFindLast() {
        Poster[] all = getFindAll();
        Poster[] reversed = new Poster[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }

        if (reversed.length <= amountOfFilms) {

            amountOfFilms = reversed.length;

        }

        Poster[] shortPoster = new Poster[amountOfFilms];
        System.arraycopy(reversed, 0, shortPoster, 0, shortPoster.length);

        return shortPoster;

    }


}

