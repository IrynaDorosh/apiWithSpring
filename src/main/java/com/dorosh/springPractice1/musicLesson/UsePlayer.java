package com.dorosh.springPractice1.musicLesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsePlayer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appCont2.xml");
        //Music classicMusic = context.getBean("classicMusic", ClassicMusic.class);
       // Player player = new Player(classicMusic);

        Player player = context.getBean("player", Player.class);

        player.playMusic();
        context.close();
    }
}
