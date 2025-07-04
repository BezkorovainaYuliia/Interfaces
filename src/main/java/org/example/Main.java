package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Polimorphism");
        Playable[]  playable = {new MusicPlayer(),new VideoPlayer(), new MusicPlayer() };
        for (Playable playable1 : playable) {
            playable1.play();
        }
        System.out.println("Als Parameter");
        MediaController mediaController = new MediaController();
        mediaController.playMedia(new VideoPlayer());
        mediaController.playMedia(new MusicPlayer());
    }
}