package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Polimorphism");
        Playable[]  playable = {new MusicPlayer(),new VideoPlayer(), new MusicPlayer() };
        for (Playable playable1 : playable) {
            playable1.play(); // Aufruf nur Methoden, die das Interface hat

            if (playable1 instanceof MusicPlayer){ //Typenvergleichung
                //Typ-Casting oder Typumwandlung
                ((MusicPlayer) playable1).audio(); // die Methoden, die die Class MusicPlayer hat
            }
            if (playable1 instanceof VideoPlayer){ //Typenvergleichung
                //Typ-Casting oder Typumwandlung
                ((VideoPlayer) playable1).video(); // die Methoden, die die Class VideoPlayer hat
            }
        }

        System.out.println("");
        System.out.println("Als Parameter");
        MediaController mediaController = new MediaController();

        mediaController.playMedia(new VideoPlayer());
        mediaController.playMedia(new MusicPlayer());
    }
}