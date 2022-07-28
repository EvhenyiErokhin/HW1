package HW1.Music;

import java.util.concurrent.CopyOnWriteArrayList;

public class RNB implements Runnable {
    @Override
    public void run(){
        String music = "Bass";
        CopyOnWriteArrayList<String> list = Top.copyOnWriteArrayList;
        list.add(music);
        //System.out.println(music);
    }
}