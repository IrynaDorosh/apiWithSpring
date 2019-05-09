package com.dorosh.springPractice1.DI2L6;

public class Player {

//    public Player(Music music) {
//        this.music = music;
//    }
    public Player (){}

    private Music music;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private String name;
    private int volume;

    public void setMusic (Music music){
        this.music = music;
    }

    public void playMusic(){
        music.play();

    }
}
