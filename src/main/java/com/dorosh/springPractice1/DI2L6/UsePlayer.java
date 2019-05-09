package com.dorosh.springPractice1.DI2L6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsePlayer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContForDI2L6.xml");
        //Music classicMusic = context.getBean("classicMusic", ClassicMusic.class);
       // Player player = new Player(classicMusic);

        Player player = context.getBean("player", Player.class);

        player.playMusic();
        System.out.println(player.getName());
        System.out.println(player.getVolume());
        context.close();
    }
}
