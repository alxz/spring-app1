package ru.alex.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
//    private Music music;
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }

//    public ArrayList<Music> getMusicList() {
//        return new ArrayList<Music>(musicList);
//    }

    public void setMusicList(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    // IoC is here:

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
//    public MusicPlayer() {}
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    public void setMusic(Music music) {
//        this.music = music;
//    }
}
