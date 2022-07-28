package HW1.FireDepartment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;

public class FireMan extends Thread {
    final AtomicInteger alarm = new AtomicInteger();

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String alarmInput;
        try {
            alarmInput = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        alarm.set(Integer.parseInt(alarmInput));

        if (alarm.get() == 1) {
            System.out.println("Rushed to the challenge!");
        }

    }
}