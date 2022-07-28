package HW1.Music;

import java.util.concurrent.CopyOnWriteArrayList;

public class Top {
    public static CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
    private void print(boolean printList){
        for (String track : copyOnWriteArrayList) {
            System.out.println(track);
        }
    }
}