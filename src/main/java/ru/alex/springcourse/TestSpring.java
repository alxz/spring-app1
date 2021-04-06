package ru.alex.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);

        context.close();
    }
}


//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
//        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

//        System.out.println(classicalMusic1 == classicalMusic2);

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
//        classicalMusicPlayer.playMusic();

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparision = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparision);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//        musicPlayer.playMusicList();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
