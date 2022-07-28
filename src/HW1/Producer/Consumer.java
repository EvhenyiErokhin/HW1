package HW1.Producer;

public class Consumer implements Runnable {
    Film film;
    public Consumer(Film film) {
        this.film = film;
    }
    @Override
    public void run(){
        film.getFilmName();
        film.getFilmLength();
    }
}