package ru.alex.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong() + " with volume " + this.volume;
    }


//    private Music music1;
//    private Music music2;
////@Autowired
//    public MusicPlayer(@Qualifier("rockMusic") Music music1,
//                       @Qualifier("classicalMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }
//
//    public String playMusic() {
//        return "Playing: " +  music1.getSong() + "\n playing: " + music2.getSong() ;
//    }

}

//    @Autowired
//    public MusicPlayer(Music music) { this.music = music; }
//
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
// IoC

//    private List<Music> musicList = new ArrayList<>();
//
//    private String name;
//    private int volume;
//
//    public String getName() {
//        return name;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//    public void setVolume(int volume){
//        this.volume = volume;
//    }
//
////    public ArrayList<Music> getMusicList() {
////        return new ArrayList<Music>(musicList);
////    }
//
//    public void setMusicList(ArrayList<Music> musicList) {
//        this.musicList = musicList;
//    }
//
//    // IoC is here:
//
//    public void playMusicList() {
//        for (Music music : musicList) {
//            System.out.println("Playing: " + music.getSong());
//        }
//    }
//    public MusicPlayer() {}
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    public void setMusic(Music music) {
//        this.music = music;
//    }