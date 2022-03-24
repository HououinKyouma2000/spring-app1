package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music=context.getBean("rock",Music.class);

        MusicPlayer musicPlayer=new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music1=context.getBean("classical",Music.class);
        MusicPlayer classicalPlayer =new MusicPlayer(music1);
        classicalPlayer.playMusic();
        context.close();
    }
}
