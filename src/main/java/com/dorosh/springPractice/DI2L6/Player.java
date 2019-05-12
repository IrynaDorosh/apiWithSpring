package com.dorosh.springPractice.DI2L6;

import lombok.Data;
@Data
public class Player {

//    public Player(Music music) {
//        this.music = music;
//    }

    public Player (){}

    private Music music;
    private String name;
    private int volume;

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

    public void setMusic (Music music){
        this.music = music;
    }

    public void playMusic(){
        music.play();

    }
}
