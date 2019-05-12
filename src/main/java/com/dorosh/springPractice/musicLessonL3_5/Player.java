package com.dorosh.springPractice.musicLessonL3_5;

public class Player {

    public Player(Music music) {
        this.music = music;
    }

    private Music music;
    private String s;
    int n;

    public void playMusic(){
       music.play();

    }
}
