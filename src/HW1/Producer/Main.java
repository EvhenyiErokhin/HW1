package HW1.Producer;

public class Main {
    public static void main(String[] args) {
        Film film = new Film();
        Producer producer = new Producer(film);
        Consumer consumer = new Consumer(film);
        producer.run();
        consumer.run();
        PdfWriter
    }
}