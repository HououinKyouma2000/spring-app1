package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

/*        Music music=context.getBean("rock",Music.class);

        MusicPlayer musicPlayer=new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music1=context.getBean("classical",Music.class);
        MusicPlayer classicalPlayer =new MusicPlayer(music1);
        classicalPlayer.playMusic();*/

/*        MusicPlayer musicPlayer =context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();*/

        Computer computer=context.getBean("computer",Computer.class);
        System.out.println(computer);
        context.close();
    }
}
