package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
/*  v3
    @Autowired
    private Music music;
*/
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    /*  v1
    @Autowired
    public MusicPlayer(Music music) {
        this.music=music;
    }*/
 /* V2
    public MusicPlayer(Music music) {
    this.music=music;
}
    @Autowired
    public void setMusic(Music music) {
        this.music=music;
    }*/

    public String playMusic() {
       return "Playing " + classicalMusic.getSong();
    }
}
