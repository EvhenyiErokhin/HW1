package HW1.Producer;

public  class Producer implements Runnable {
    Film film;
    public Producer(Film film){
        this.film = film;
    }
        @Override
        public void run() {
            film.setFilmName("Goodzilla");
            film.setFilmLength(90);
        }
    }