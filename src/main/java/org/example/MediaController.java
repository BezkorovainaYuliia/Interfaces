package org.example;

public class MediaController {
    public void playMedia(Playable media) {
        if(media instanceof VideoPlayer){
            ((VideoPlayer) media).video();
        }
        if(media instanceof MusicPlayer){
           ((MusicPlayer) media).audio();
        }
        media.play();
    }
}
