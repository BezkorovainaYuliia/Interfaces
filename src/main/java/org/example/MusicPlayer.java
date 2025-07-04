package org.example;

public class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing music");
    }

    @Override
    public void stop(){

    }

    public void audio(){
        System.out.println("Audio playing");
    }
}
