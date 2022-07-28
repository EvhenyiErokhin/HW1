package HW1.Music;

import java.util.concurrent.CopyOnWriteArrayList;

public class Pop implements Runnable {
    @Override
    public void run(){
        String music = "piano";
        CopyOnWriteArrayList<String> list = Top.copyOnWriteArrayList;
        list.add(music);
        //System.out.println(music);
    }
}