package Zoom5_10_OOP.Tamagotchi;

import Zoom5_10_OOP.MyDate.MyDate;
import Zoom5_10_OOP.Tamagotchi.Tamagotchi;

public class Tamagotchi_Demo {

    public static void main(String[] args){
        Tamagotchi cookie = new Tamagotchi("Cookie");

        Tamagotchi snowShoe = new Tamagotchi("SnowShoe");
        //Tamagotchi snowShoe = cookie;                 // shallow copy
      //  Tamagotchi snowShoe = new Tamagotchi(cookie);
        //Tamagotchi fifi = new Tamagotchi("FiFi");
        //snowShoe.printInfo();
       // Tamagotchi.printNumOfPets(); // use class name to invoke static method

        System.out.println(cookie);
        System.out.println(snowShoe);

        System.out.println();
        cookie.setBirthday(new MyDate(2016,"Apr", 10));
        cookie.setVocab("I am the queen.");
        snowShoe.setName("SnowShoe");
        System.out.println("This is cookie.");
        System.out.println(cookie);
        System.out.println("this is snowshoe");
        System.out.println(snowShoe);

        System.out.println();
        cookie.timeGoesBy(20);

        System.out.println();
       // cookie.printInfo();
        // cookie.timeGoesBy(6);
        System.out.println(cookie);
        //cookie.printInfo();
       // cookie.feed();
        System.out.println();
        cookie.feed();
        cookie.play();
        cookie.play();
        //cookie.teachWord("hi");
        //cookie.printInfo();
    }
}
