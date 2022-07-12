package ru.netology.domains;

public class Manager {

    private final int amountOfFilms;

    public Manager(int amount) {

        this.amountOfFilms = amount;

    }

    public Manager() {

        this.amountOfFilms = 10;

    }

    public Poster[] films = new Poster[0];

    public void save(Poster film) {
        Poster[] currentPoster = new Poster[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            currentPoster[i] = films[i];
        }
        currentPoster[currentPoster.length - 1] = film;
        films = currentPoster;
    }


    public Poster[] getPoster() {

        return films;
    }


    public Poster[] getReversePoster() {
        Poster[] all = getPoster();
        Poster[] reversed = new Poster[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public Poster[] getShortReversePoster() {
        Poster[] shortPoster = new Poster[amountOfFilms];
        System.arraycopy(getReversePoster(), 0, shortPoster, 0, shortPoster.length);

        return shortPoster;
    }
}

