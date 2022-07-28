package HW1.Music;

import java.util.concurrent.CopyOnWriteArrayList;

public class Classic implements Runnable {
    @Override
    public void run(){
        String music = "violin";
        CopyOnWriteArrayList<String> list = Top.copyOnWriteArrayList;
        list.add(music);
        //System.out.println(music);
    }
}