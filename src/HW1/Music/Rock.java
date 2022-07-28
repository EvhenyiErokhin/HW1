package HW1.Music;

import java.util.concurrent.CopyOnWriteArrayList;

public class Rock implements  Runnable {
    @Override
    public void run(){
        String music = "guitar riff";
        CopyOnWriteArrayList<String> list = Top.copyOnWriteArrayList;
        list.add(music);
       // System.out.println(music);
    }
}