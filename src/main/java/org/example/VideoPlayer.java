package org.example;

public class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing video");
    }
    @Override
    public void stop(){

    }

    public void video(){
        System.out.println("Video playing");
    }
}
