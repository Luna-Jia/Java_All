package objectsAndClass;
public class TestTV {
    public static void main(String[] args) { // main method

        TV tv1 = new TV(); // The program creates two objects in lines 5 and 10 and invokes the methods on the objects to perform actions for setting channels and volume levels and for increasing channels and volumes.
        tv1.turnOn(); // The methods are invoked using syntax such as tv1.turnOn() (line 6).
        tv1.setChannel(30); // set a new channel
        tv1.setVolume(3); // set a new volume

        TV tv2 = new TV(); // create a TV
        tv2.turnOn(); // turn on
        tv2.channelUp(); // increase channel
        tv2.channelUp();
        tv2.volumeUp(); // increase volume

// The program displays the state of the objects in lines 17-19.
        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
// The data fields are accessed using syntax such as tv1.channel (line 19).
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}

// https://liveexample.pearsoncmg.com/liang/intro12e/html/TestTV.html