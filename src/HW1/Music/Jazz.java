package HW1.Music;

import java.util.concurrent.CopyOnWriteArrayList;

public class Jazz implements Runnable {
    @Override
    public void run(){
        String music = "saxophone";
        CopyOnWriteArrayList<String> list = Top.copyOnWriteArrayList;
        list.add(music);
        //System.out.println(music);
    }
}